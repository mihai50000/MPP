package Repository;

import Model.Entity;

public interface Repository<E extends Entity<Integer>> {
    void add(E entity);

    void remove(E entity);

    void update(E entity);

    E get(int id);
}
