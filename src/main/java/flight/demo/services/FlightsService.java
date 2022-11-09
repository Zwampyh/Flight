package flight.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import flight.demo.models.Flights;
import flight.demo.repositories.FlightsRepository;

@Service
public class FlightsService {
    private FlightsRepository fr;

    @Autowired
    public FlightsService(FlightsRepository fr) {
        this.fr = fr;
    }

    @Transactional
    public List<Flights> getFlightsByDeparture(String departureCity) {
        return this.fr.getFlightsByDeparture(departureCity);
    }

    @Transactional
    public List<Flights> getFlightsByDepartureAndArrival(String departureCity, String arrivalCity) {
        return this.fr.getFlightsByDepartureAndArrival(departureCity, arrivalCity);
    }
}