package com.curso.springai.asistentemedico.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ChatClient construido sobre el ChatModel de Ollama
 */
@Configuration
public class ChatClientConfig {

	private static final String PREFIJO_PROMPT = """
			Eres un asistente médico informativo. Responde siempre en español.
			El usuario (paciente) te indicará un síntoma. Explica de forma breve y clara
			cuáles pueden ser las causas más habituales de ese síntoma.
			No emitas un diagnóstico definitivo ni recetes medicamentos.
			Termina SIEMPRE tu respuesta recomendando acudir a un médico
			especialista, indicando qué especialidad sería la más adecuada.
			""";

	@Bean
	public ChatClient chatClient(ChatClient.Builder builder) {
		return builder
				.defaultSystem(PREFIJO_PROMPT)
				.build();
	}
}
