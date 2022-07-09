package br.com.microservice.cambioservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.microservice.cambioservice.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

	Cambio findByFromAndTo(String from, String to);
	
}
