package com.namar.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.namar.DemoConsolaApplication;

@Repository
public class PersonaRepoImpl implements IPersonaRepo{

	private static Logger log = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Override
	public void registrar(String nombre) {
		
		log.info("Se registro a: " + nombre);
		
	}

}
