package br.com.webwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.webwork.model.Flight;
import br.com.webwork.repository.FlightRepository;

/**
 * 
 * @author Thiago
 *
 */


@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	public ResponseEntity<Flight> saveFlight(Flight flight){
		this.flightRepository.save(flight);
		return ResponseEntity.ok().build();
	}
	
	public Flight findById(String id){
		return flightRepository.findOne(id);
	}
	
	public List<Flight> findFlights(){
		return this.flightRepository.findAll();
	}
	
	public ResponseEntity<Void> updateFlightById(Flight flight, String id){
		
		Flight object = flightRepository.findOne(id);
		
		if(object == null){
			return ResponseEntity.notFound().build();
		}
		
		 Flight flightBuild = new Flight.FlightBuilder(id).withCity(flight.getCity())
		.withCountry(flight.getCountry())
		.withCompany(flight.getCompany())
		.withGate(flight.getGate())
		.withNumbetFlight(flight.getNumberFlight())
		.withAmount(flight.getAmount())
		.withTypeFlight(flight.getTypeFlight())
		.withDepartureTime(flight.getDepartureTime())
		.withArrivalTime(flight.getArrivalTime())
		.withTax(flight.getTax())
		.build();
		
		this.saveFlight(flightBuild);
		
		return ResponseEntity.ok().build();
	}
	
	public ResponseEntity<Flight> deleteFlightById(String id){
		
		Flight flight = flightRepository.findOne(id);
		
		if(flight == null) {
			
			return ResponseEntity.notFound().build();
		}
		
		flightRepository.delete(flight);
		
		return ResponseEntity.ok().build();
	}
}
