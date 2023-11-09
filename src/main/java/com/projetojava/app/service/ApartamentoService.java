package com.projetojava.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetojava.app.entidades.Apartamento;
import com.projetojava.app.repositories.ApartamentoRepository;

@Service	
public class ApartamentoService {
	
	@Autowired
	private ApartamentoRepository ar;
	
	public List<Apartamento> findAll(){
		return ar.findAll();
	}
	
	public Apartamento findById(Long id){
			Optional<Apartamento> obj = ar.findById(id);
			return obj.get();
	}
	
	public Apartamento insert(Apartamento obj) {
		return ar.save(obj);
	}
}
