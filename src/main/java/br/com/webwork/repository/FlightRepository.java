package br.com.webwork.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.webwork.model.Flight;

/**
 * 
 * @author Thiago
 *
 */

@Repository
public interface FlightRepository extends MongoRepository<Flight, String>{
	
}
