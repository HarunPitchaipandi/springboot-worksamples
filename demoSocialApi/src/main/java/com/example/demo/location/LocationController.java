package com.example.demo.location;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
	   @Autowired
	   private LocationService LocationService;
	
	   @RequestMapping(value="/locations")
	   public List<Location> getAllLocations(){
		   
		return LocationService.getAllLocations();
		
	 }	
	   
	   @RequestMapping(value="/locations/{id}")
	   public Location getLocation(@PathVariable String id) {
		   
		   return LocationService.getLocation(id);
		   
	 }
	   
	   @RequestMapping(value="/locations", method=RequestMethod.POST)
	   public void addLocation(@RequestBody Location location){
		   
		   LocationService.addLocation(location);
		   
	   }

}
