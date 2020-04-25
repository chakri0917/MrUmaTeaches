package com.tracker.server.dao;

import java.util.List;

import com.tracker.server.entities.Country;

public interface CountryDAO {
	
	public Country getCountry(Country country);
	
	public List<Country> getAllCountries();
	

}
