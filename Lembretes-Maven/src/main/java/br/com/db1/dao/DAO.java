package br.com.db1.dao;

import java.util.List;

public interface DAO<T> {
	List<T> listar();
	
	boolean save(T t);

}