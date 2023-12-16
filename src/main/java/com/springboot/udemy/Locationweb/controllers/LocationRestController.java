package com.springboot.udemy.Locationweb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.udemy.Locationweb.entities.Location;
import com.springboot.udemy.Locationweb.repository.LocationRepository;
import com.springboot.udemy.Locationweb.service.LocationService;

@RestController
@RequestMapping("/locations") // it will handle all requests going from /locations
public class LocationRestController {

	@Autowired
	LocationRepository locationRepo;
	
	@Autowired
	LocationService service;

	// getAllLocations
	@GetMapping
	public List<Location> getAllLocations() {
		return locationRepo.findAll();
	}

	// get single Location by ID
	@GetMapping("/{id}")
	public Optional<Location> getLocation(@PathVariable("id") int id) {
		return locationRepo.findById(id);
	}

	// Create
	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		// @RequestBody --> take care of JSON object to Location Object conversion
		return locationRepo.save(location);
	}

	// Update
	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		// @RequestBody --> take care of JSON object to Location Object conversion
		return locationRepo.save(location);
	}

	// Delete
	@DeleteMapping("/{id}")
	public List<Location> deleteLocation(@PathVariable("id") int id) {
		locationRepo.deleteById(id);
		return locationRepo.findAll();
	}

}
