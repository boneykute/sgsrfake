/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.dynamicdata;

import com.sgs.game.sgsr.server.dto.IBaseDTO;
import com.smartfoxserver.v2.entities.data.SFSObject;

// TODO: Auto-generated Javadoc
/**
 * The Interface BaseDynamicDataDTO.
 */
public interface IBaseDynamicDataDTO extends IBaseDTO {

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
	public IBaseDynamicDataDTO fromSFSObject();

}
