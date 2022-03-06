package Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Plane extends Entity<Integer> {
    int numberOfSeats;
    int numberOfUnoccupiedSeats;
}
