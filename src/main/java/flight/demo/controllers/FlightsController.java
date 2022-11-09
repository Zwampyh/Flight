package flight.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import flight.demo.models.Flights;
import flight.demo.services.FlightsService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class FlightsController {
    private FlightsService fs;

    @Autowired
    public FlightsController(FlightsService fs) {
        this.fs = fs;
    }

    @GetMapping("flights/{departure-city}") 
    public List<Flights> getFlightsByDeparture(@PathVariable("departure-city") String departureCity) {
        return this.fs.getFlightsByDeparture(departureCity);
    }

    @GetMapping("flights/{departure-city}/{arrival-city}") 
    public List<Flights> getFlightsByDepartureAndArrival(@PathVariable("departure-city") String departureCity, @PathVariable("arrival-city") String arrivalCity) {
        return this.fs.getFlightsByDepartureAndArrival(departureCity, arrivalCity);
    }
}