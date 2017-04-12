/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao;

import java.util.List;

/**
 * The Interface BaseDAO.
 */
public interface IBaseDAO<T> {
	public T get(int id);

	public T create(T object);

	public T update(T object);

	public T remove(int id);

	public T replace(T object);

	public int count();

	public List<T> getRange(int start, int count);
}
