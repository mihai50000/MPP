package Repository;

import Model.Credentials;

public interface CredentialsRepository extends Repository<Credentials> {
    String getPassword(String username);
}
