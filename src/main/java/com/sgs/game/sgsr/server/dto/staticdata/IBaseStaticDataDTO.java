/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import com.sgs.game.sgsr.server.dto.IBaseDTO;

/**
 * The Interface BaseStaticDataDTO.
 *
 * @param <T>
 *            the generic type
 */
public interface IBaseStaticDataDTO<T extends BaseStaticDataDTO<T>> extends IBaseDTO {
	public abstract T clone();
}
