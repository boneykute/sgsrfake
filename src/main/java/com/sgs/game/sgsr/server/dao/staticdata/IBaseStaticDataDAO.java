/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import java.util.HashMap;
import java.util.List;

import com.sgs.game.sgsr.server.dao.IBaseDAO;
import com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO;

/**
 * The Interface BaseStaticDataDAO.
 * 
 * @param <T>
 */
public interface IBaseStaticDataDAO<T extends BaseStaticDataDTO<T>> extends IBaseDAO<T> {

	public T findByName(String name);

	public HashMap<Integer, T> getAllDTOObject();
}
