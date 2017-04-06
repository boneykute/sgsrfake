/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.dynamicdata;

import com.sgs.game.sgsr.server.dto.BaseDTO;
import com.smartfoxserver.v2.entities.data.SFSObject;

/**
 * The Interface BaseDynamicDataDTO.
 */
public interface BaseDynamicDataDTO extends BaseDTO {

	/**
	 * To SFS object.
	 *
	 * @return the SFS object
	 */
	public SFSObject toSFSObject();

	/**
	 * From SFS object.
	 *
	 * @return the base dynamic data DTO
	 */
	public BaseDynamicDataDTO fromSFSObject();

}
