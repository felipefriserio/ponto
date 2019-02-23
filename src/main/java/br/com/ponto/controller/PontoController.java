package br.com.ponto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ponto")
public class PontoController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
}
