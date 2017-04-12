/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import com.sgs.game.sgsr.server.dto.IBaseDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface BaseStaticDataDTO.
 *
 * @param <T>
 *            the generic type
 */
public interface IBaseStaticDataDTO<T extends BaseStaticDataDTO<T>> extends IBaseDTO {

	/**
	 * Clone.
	 *
	 * @return the t
	 */
	public abstract T clone();
}
