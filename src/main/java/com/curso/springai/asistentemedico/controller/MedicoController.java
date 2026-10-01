package com.curso.springai.asistentemedico.controller;

import com.curso.springai.asistentemedico.service.MedicoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/asistente")
public class MedicoController {

	private final MedicoService medicoService;

	public MedicoController(MedicoService medicoService) {
		this.medicoService = medicoService;
	}

	@GetMapping("/sintoma")
	public String consultarSintoma(@RequestParam String sintoma) {
		return medicoService.consultarSintoma(sintoma);
	}
}
