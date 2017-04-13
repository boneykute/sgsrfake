/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Season;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class SeasonDAO.
 */
public class SeasonDAO extends BaseStaticDataDAO<Season> {

	/**
	 * Instantiates a new season DAO.
	 *
	 * @param version
	 *            the version
	 */
	public SeasonDAO(String version) {
		super(version, DataFileType.Season.toString());
	}

}
