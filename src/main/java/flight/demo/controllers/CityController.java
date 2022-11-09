package flight.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import flight.demo.models.Cities;
import flight.demo.services.CityService;

@RestController
@CrossOrigin
public class CityController {
	private CityService cs;
	
	@Autowired
	public CityController(CityService cs) {
		this.cs = cs;
	}
	
	@GetMapping("cities")
	public List<Cities> getCities(){
		return this.cs.getAllCities();
	}
	
	

}
