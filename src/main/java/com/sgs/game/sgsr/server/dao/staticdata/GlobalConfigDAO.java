/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.GlobalConfig;

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
	 * @param key
	 *            the key
	 */
	public GlobalConfigDAO(String version, String key) {
		super(version, key);
	}
}
