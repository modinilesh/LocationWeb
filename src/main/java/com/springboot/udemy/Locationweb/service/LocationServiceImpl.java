package com.springboot.udemy.Locationweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.udemy.Locationweb.entities.Location;
import com.springboot.udemy.Locationweb.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository repo;

	@Override
	public Location saveLocation(Location location) {
		// Saving the Location
		return repo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// updating the Location
		return repo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		// Deleting Location
		repo.delete(location);

	}

	@Override
	public Location getLocationById(int id) {
		// Get Location By ID
		Location location = repo.findById(id).get();
		return location;
	}

	@Override
	public List<Location> getAllLocations() {
		// Get All Locations
		List<Location> list = repo.findAll();
		return list;
	}

}
