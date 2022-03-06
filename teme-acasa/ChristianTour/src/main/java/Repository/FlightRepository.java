package Repository;

import Model.Destination;
import Model.Flight;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends Repository<Flight> {
    List<Flight> getFlightsForDestinationAndDate(Destination from, Destination to, Date date);
}
