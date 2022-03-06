package Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Destination extends Entity<Integer> {
    String country;
    String city;
    String airport;
}
