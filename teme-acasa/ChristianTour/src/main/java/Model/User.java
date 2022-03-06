package Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class User extends Entity<Integer> {
    String firstName;
    String lastName;
}
