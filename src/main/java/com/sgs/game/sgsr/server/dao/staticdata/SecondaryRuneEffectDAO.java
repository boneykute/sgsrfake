/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.SecondaryRuneEffect;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class SecondaryRuneEffectDAO.
 */
public class SecondaryRuneEffectDAO extends BaseStaticDataDAO<SecondaryRuneEffect> {

	/**
	 * Instantiates a new secondary rune effect DAO.
	 *
	 * @param version
	 *            the version
	 */
	public SecondaryRuneEffectDAO(String version) {
		super(version, DataFileType.SecondaryRuneEffect.toString());
	}

}
