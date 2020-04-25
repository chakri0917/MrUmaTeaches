package com.tracker.server.dao;

import java.util.List;

import com.tracker.server.entities.Country;
import com.tracker.server.entities.State;

public interface StateDAO {
	
	public State getStateDetails(State state);
	
	public List<State> getStatesInCountry(Country country);
	

}
