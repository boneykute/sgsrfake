/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Booster;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class BoosterDAO.
 */
public class BoosterDAO extends BaseStaticDataDAO<Booster> {

	/**
	 * Instantiates a new booster DAO.
	 *
	 * @param version
	 *            the version
	 */
	public BoosterDAO(String version) {
		super(version, DataFileType.Booster.toString());
	}

}
