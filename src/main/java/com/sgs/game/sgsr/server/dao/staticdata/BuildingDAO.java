/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Building;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class BuildingDAO.
 */
public class BuildingDAO extends BaseStaticDataDAO<Building> {

	/**
	 * Instantiates a new building DAO.
	 *
	 * @param version
	 *            the version
	 */
	public BuildingDAO(String version) {
		super(version, DataFileType.Building.toString());
	}

}
