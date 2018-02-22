package br.com.webwork.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Thiago
 *
 */

@Document
public class Flight implements Serializable{
	
	private static final long serialVersionUID = -5397526624782727770L;
	
	@Id
	private String id;
	private String city;
	private String country;
	private Company company;
	private String gate;
	private Long numberFlight;
	private BigDecimal amount;
	private String typeFlight;
	private String horarioChegada;
	private String horarioSaida;
	private Boolean tax;
	
	public Flight() {}
	
	public static class FlightBuilder {
		
		private String id;
		private String city;
		private String country;
		private Company company;
		private String gate;
		private Long numberFlight;
		private BigDecimal amount;
		private String typeFlight;
		private String horarioChegada;
		private String horarioSaida;
		private Boolean tax;
		
	    public FlightBuilder(String id) {
            this.id = id;
        }
		
	    public FlightBuilder withCity(String city) {
            this.city = city;
            return this;
        }
	    public FlightBuilder withCountry(String country) {
            this.country = country;
            return this;
        }
	    public FlightBuilder withCompany(Company company) {
            this.company = company;
            return this;
        }
	    public FlightBuilder withGate(String gate) {
            this.gate = gate;
            return this;
        }
	    public FlightBuilder withNumbetFlight(Long numberFlight) {
            this.numberFlight = numberFlight;
            return this;
        }
	    public FlightBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }
	    public FlightBuilder withTypeFlight(String typeFlight) {
            this.typeFlight = typeFlight;
            return this;
        }
	    public FlightBuilder withHorarioChegada(String horarioChegada) {
            this.horarioChegada = horarioChegada;
            return this;
        }
	    public FlightBuilder withHorarioSaida(String horarioSaida) {
            this.horarioSaida = horarioSaida;
            return this;
        }
	    public FlightBuilder withTax(Boolean tax) {
            this.tax = tax;
            return this;
        }
	    
	    public Flight build(){
          
	    	Flight flight = new Flight(); 
	    	flight.id = this.id;
	    	flight.city = this.city;
	    	flight.country = this.country;
	    	flight.company = this.company;
	    	flight.gate = this.gate;
			flight.numberFlight = this.numberFlight;
			flight.amount = this.amount;
			flight.typeFlight = this.typeFlight;
			flight.horarioSaida = this.horarioSaida;
			flight.horarioChegada = this.horarioChegada;
			flight.tax = this.tax;
			
            return flight;
        }
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Long getNumberFlight() {
		return numberFlight;
	}
	public void setNumberFlight(Long numberFlight) {
		this.numberFlight = numberFlight;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getTypeFlight() {
		return typeFlight;
	}
	public void setTypeFlight(String typeFlight) {
		this.typeFlight = typeFlight;
	}
	public String getHorarioChegada() {
		return horarioChegada;
	}
	public void setHorarioChegada(String horarioChegada) {
		this.horarioChegada = horarioChegada;
	}
	public String getHorarioSaida() {
		return horarioSaida;
	}
	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	public Boolean getTax() {
		return tax;
	}
	public void setTax(Boolean tax) {
		this.tax = tax;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
}
