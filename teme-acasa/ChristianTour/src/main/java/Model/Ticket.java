package Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Ticket extends Entity<Integer> {
    String clientName;
    String clientAddress;
    Flight flight;
}
