/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.PrimaryRune;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class PrimaryRuneDAO.
 */
public class PrimaryRuneDAO extends BaseStaticDataDAO<PrimaryRune> {

	/**
	 * Instantiates a new primary rune DAO.
	 *
	 * @param version
	 *            the version
	 */
	public PrimaryRuneDAO(String version) {
		super(version, DataFileType.PrimaryRune.toString());
	}

}
