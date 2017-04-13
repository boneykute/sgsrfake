/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.PrimaryRuneConfiguration;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class PrimaryRuneConfigurationDAO.
 */
public class PrimaryRuneConfigurationDAO extends BaseStaticDataDAO<PrimaryRuneConfiguration> {

	/**
	 * Instantiates a new primary rune configuration DAO.
	 *
	 * @param version
	 *            the version
	 */
	public PrimaryRuneConfigurationDAO(String version) {
		super(version, DataFileType.PrimaryRuneConfiguration.toString());
	}

}
