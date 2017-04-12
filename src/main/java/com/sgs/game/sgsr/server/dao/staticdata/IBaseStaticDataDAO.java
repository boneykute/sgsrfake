/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import java.util.HashMap;

import com.sgs.game.sgsr.server.dao.IBaseDAO;
import com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface BaseStaticDataDAO.
 *
 * @param <T>
 *            the generic type
 */
public interface IBaseStaticDataDAO<T extends BaseStaticDataDTO<T>> extends IBaseDAO<T> {

	/**
	 * Find by name.
	 *
	 * @param name
	 *            the name
	 * @return the t
	 */
	public T findByName(String name);

	/**
	 * Gets the all DTO object.
	 *
	 * @return the all DTO object
	 */
	public HashMap<Integer, T> getAllDTOObject();
}
