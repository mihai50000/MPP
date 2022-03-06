package Repository;

import Model.Destination;

import java.util.List;

public interface DestinationRepository extends Repository<Destination> {
    List<Destination> getAllDestinations();
}
