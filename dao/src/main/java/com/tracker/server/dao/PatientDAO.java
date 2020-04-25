package com.tracker.server.dao;

import java.util.List;

import com.tracker.server.entities.Country;
import com.tracker.server.entities.Patient;
import com.tracker.server.entities.State;

public interface PatientDAO {
	
	public Patient getPatientDetails(Patient patient);
	
	public List<Patient> getAllPatients();
	
	public List<Patient> gtPatientsByRegion(Patient patient);
	
	public List<Patient> getPatientsByState(State state);
	
	public List<Patient> getPatientsByCountry(Country country);

}
