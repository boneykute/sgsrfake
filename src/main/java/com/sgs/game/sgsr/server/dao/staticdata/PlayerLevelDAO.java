/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.PlayerLevel;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerLevelDAO.
 */
public class PlayerLevelDAO extends BaseStaticDataDAO<PlayerLevel> {

	/**
	 * Instantiates a new player level DAO.
	 *
	 * @param version
	 *            the version
	 */
	public PlayerLevelDAO(String version) {
		super(version, DataFileType.PlayerLevel.toString());
	}

}
