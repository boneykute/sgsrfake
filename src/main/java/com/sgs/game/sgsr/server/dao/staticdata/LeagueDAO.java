/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.League;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class LeagueDAO.
 */
public class LeagueDAO extends BaseStaticDataDAO<League> {

	/**
	 * Instantiates a new league DAO.
	 *
	 * @param version
	 *            the version
	 */
	public LeagueDAO(String version) {
		super(version, DataFileType.League.toString());
	}

}
