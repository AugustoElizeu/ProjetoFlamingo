package com.projetojava.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projetojava.app.entidades.Apartamento;
import com.projetojava.app.repositories.ApartamentoRepository;

@Controller
public class ApartamentoControle {
	@Autowired
	private ApartamentoRepository ap;
	
	@RequestMapping(method=RequestMethod.POST, value="/cadapartamento")
	public String salvar(Apartamento apartamento) {
		ap.save(apartamento);
		return "/cadastro";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/buscarAloc")
	public String buscarAloc(Long id, Model model) {
		Optional<Apartamento> obj = ap.findById(id);
		System.out.println(obj.get());
		model.addAttribute("apartamentos", obj.get());
		return "/consulta";
	}
	
}
