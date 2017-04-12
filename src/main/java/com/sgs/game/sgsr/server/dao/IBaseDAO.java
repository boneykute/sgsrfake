/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface BaseDAO.
 *
 * @param <T>
 *            the generic type
 */
public interface IBaseDAO<T> {

	/**
	 * Gets the.
	 *
	 * @param id
	 *            the id
	 * @return the t
	 */
	public T get(int id);

	/**
	 * Creates the.
	 *
	 * @param object
	 *            the object
	 * @return the t
	 */
	public T create(T object);

	/**
	 * Update.
	 *
	 * @param object
	 *            the object
	 * @return the t
	 */
	public T update(T object);

	/**
	 * Removes the.
	 *
	 * @param id
	 *            the id
	 * @return the t
	 */
	public T remove(int id);

	/**
	 * Replace.
	 *
	 * @param object
	 *            the object
	 * @return the t
	 */
	public T replace(T object);

	/**
	 * Count.
	 *
	 * @return the int
	 */
	public int count();

	/**
	 * Gets the range.
	 *
	 * @param start
	 *            the start
	 * @param count
	 *            the count
	 * @return the range
	 */
	public List<T> getRange(int start, int count);
}
