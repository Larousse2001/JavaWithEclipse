package TP91;

import java.util.List;

public interface ID<T> {
	boolean add(T o);
	boolean delete(T o);
	boolean update(T o);
	public T findByID(int id);
	public List<T> findall();
}
