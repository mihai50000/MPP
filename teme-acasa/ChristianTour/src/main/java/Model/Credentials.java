package Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Credentials extends Entity<Integer> {
    String username;
    String password;
}
