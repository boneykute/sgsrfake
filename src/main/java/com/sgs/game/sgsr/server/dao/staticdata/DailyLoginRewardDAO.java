/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.DailyLoginReward;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class DailyLoginRewardDAO.
 */
public class DailyLoginRewardDAO extends BaseStaticDataDAO<DailyLoginReward> {

	/**
	 * Instantiates a new daily login reward DAO.
	 *
	 * @param version
	 *            the version
	 */
	public DailyLoginRewardDAO(String version) {
		super(version, DataFileType.DailyLoginReward.toString());
	}

}
