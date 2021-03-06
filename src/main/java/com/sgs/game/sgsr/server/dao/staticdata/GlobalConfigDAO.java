/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.GlobalConfig;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class GlobalConfigDAO.
 */
public class GlobalConfigDAO extends BaseStaticDataDAO<GlobalConfig> {

	/**
	 * Instantiates a new global config DAO.
	 *
	 * @param version
	 *            the version
	 */
	public GlobalConfigDAO(String version) {
		super(version, DataFileType.GlobalConfig.toString());
	}

}
