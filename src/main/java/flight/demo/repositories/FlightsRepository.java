package flight.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flight.demo.models.Flights;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, Integer> {
    @Query(value = "SELECT * FROM Flights WHERE Flights.departure_city = :departure_city", nativeQuery = true)
    public List<Flights> getFlightsByDeparture(@Param("departure_city") String departureCity);

    @Query(value = "SELECT * FROM Flights WHERE Flights.departure_city = :departure_city AND Flights.arrival_city = :arrival_city", nativeQuery = true)
    public List<Flights> getFlightsByDepartureAndArrival(@Param("departure_city") String departureCity, @Param("arrival_city") String arrivalCity);
}