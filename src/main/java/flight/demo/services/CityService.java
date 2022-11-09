package flight.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flight.demo.models.Cities;
import flight.demo.repositories.CitiesRepository;

@Service
public class CityService {
	private CitiesRepository cr;
	
	@Autowired
	public CityService(CitiesRepository cr) {
		this.cr = cr;
	}
	
	
	public List<Cities> getAllCities(){
		return this.cr.findAll();
	}
	
	

}
