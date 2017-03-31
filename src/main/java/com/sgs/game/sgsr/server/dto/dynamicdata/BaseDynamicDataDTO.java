package com.sgs.game.sgsr.server.dto.dynamicdata;

import com.sgs.game.sgsr.server.dto.BaseDTO;
import com.smartfoxserver.v2.entities.data.SFSObject;

public interface BaseDynamicDataDTO extends BaseDTO {

	public SFSObject toSFSObject();

	public BaseDynamicDataDTO fromSFSObject();

}
