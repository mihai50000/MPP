package Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class Flight extends Entity<Integer> {
    Destination from;
    Destination to;
    Plane plane;
    Date start;
    Date arrive;
}
