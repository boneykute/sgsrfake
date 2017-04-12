/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Chest;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class ChestDAO.
 */
public class ChestDAO extends BaseStaticDataDAO<Chest> {

	/**
	 * Instantiates a new chest DAO.
	 *
	 * @param version
	 *            the version
	 */
	public ChestDAO(String version) {
		super(version, DataFileType.Chest.toString());
	}

}
