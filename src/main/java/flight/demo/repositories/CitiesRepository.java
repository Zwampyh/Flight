package flight.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flight.demo.models.Cities;

@Repository
public interface CitiesRepository extends JpaRepository<Cities, Integer> {

}