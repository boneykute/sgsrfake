/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.SecondaryRune;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class SecondaryRuneDAO.
 */
public class SecondaryRuneDAO extends BaseStaticDataDAO<SecondaryRune> {

	/**
	 * Instantiates a new secondary rune DAO.
	 *
	 * @param version
	 *            the version
	 */
	public SecondaryRuneDAO(String version) {
		super(version, DataFileType.SecondaryRune.toString());
	}

}
