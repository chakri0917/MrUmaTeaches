package com.tracker.server.dao;

import java.util.List;

import com.tracker.server.entities.Region;

public interface RegionDAO {

	public Region getRegion(Region region);
	
	public List<Region> getAllRegions();
}
