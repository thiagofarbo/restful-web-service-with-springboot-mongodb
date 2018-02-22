package br.com.webwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.webwork.model.Flight;
import br.com.webwork.service.FlightService;

/**
 * 
 * @author Thiago
 *
 */

@Controller
@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@RequestMapping(value="/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Flight> save(@RequestBody Flight flight){
		return this.flightService.saveFlight(flight);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Flight search(@PathVariable String id){
		
		return flightService.findById(id);
	}
	
	@RequestMapping(value="/all", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Flight> findAllFlights(){
		return flightService.findFlights();
	}
	
	@RequestMapping(value="/update/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Flight flight, @PathVariable String id){
		return flightService.updateFlightById(flight, id);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Flight> delete(@PathVariable String id){
		return flightService.deleteFlightById(id);
	}
}
