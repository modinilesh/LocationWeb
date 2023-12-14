package com.springboot.udemy.Locationweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.udemy.Locationweb.entities.Location;
import com.springboot.udemy.Locationweb.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService service;

	// creating the Location
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	// once form is filled page will redirect to same /showCreate with success
	// message
	@PostMapping("/saveLocation")
	public String savelocation(@ModelAttribute("location") Location location, ModelMap modelmap) {
		// @ModelAttribute("location") --> at Location class all fields will
		// automatically be stored or assigned and will be formed as an object of
		// Location
		// ModelMap modelmap --> used to send back the response to the UI

		Location savedLocation = service.saveLocation(location);
		String msg = "Location with id : " + savedLocation.getId() + " is successfully saved.";

		// let's add message to the UI
		modelmap.addAttribute("message", msg);

		return "createLocation";
	}

	// To display all the locations from DB
	@GetMapping("/displayLocations")
	public String displayAll(ModelMap modelmap) {
		List<Location> allLocations = service.getAllLocations();
		modelmap.addAttribute("locations", allLocations);
		return "displayLocations";
	}

	// To Delete the Location
	@GetMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelmap) {
		// @RequestParam("id") --> tells id variable is coming from UI/URI
		Location location = service.getLocationById(id);
		service.deleteLocation(location);

		// after deletion sending response back to the UI
		List<Location> allLocations = service.getAllLocations();
		modelmap.addAttribute("locations", allLocations);

		return "displayLocations";
	}

	// To Update/Edit the Location
	@GetMapping("/updateLocation")
	public String updateLocation(@RequestParam("id") int id, ModelMap modelmap) {
		// @RequestParam("id") --> tells id variable is coming from UI/URI
		Location location = service.getLocationById(id);
		service.deleteLocation(location);

		// sending response back to the UI editLocation
		modelmap.addAttribute("location", location);

		return "updateLocation";
	}

	@PostMapping("/updateLoc")
	public String updateloc(@ModelAttribute("location") Location location, ModelMap modelmap) {
		service.updateLocation(location);

		// after update sending response back to the UI
		List<Location> allLocations = service.getAllLocations();
		modelmap.addAttribute("locations", allLocations);
		return "displayLocations";
	}

}
