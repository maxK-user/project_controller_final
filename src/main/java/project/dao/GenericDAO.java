package project.dao;

import java.util.List;

public interface GenericDAO<E> {
    E getById(long id);
    List<E> getAll();
    boolean insert(E e);
    boolean update(E e);
    boolean deleteById(long id);
}
