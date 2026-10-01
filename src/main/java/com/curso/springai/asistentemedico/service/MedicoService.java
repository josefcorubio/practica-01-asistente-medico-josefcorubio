package com.curso.springai.asistentemedico.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

	private final ChatClient chatClient;

	public MedicoService(ChatClient chatClient) {
		this.chatClient = chatClient;
	}

	public String consultarSintoma(String sintoma) {
		return chatClient.prompt()
				.user("Tengo el siguiente síntoma: " + sintoma)
				.call()
				.content();
	}
}
