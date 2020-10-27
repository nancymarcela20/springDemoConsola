package com.namar.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.namar.DemoConsolaApplication;

@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersonaRepo{

	private static Logger log = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Override
	public void registrar(String nombre) {
		
		log.info("No se registro a: " + nombre);
		
	}

}
