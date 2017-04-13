/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.CharacterStat;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class CharacterStatDAO.
 */
public class CharacterStatDAO extends BaseStaticDataDAO<CharacterStat> {

	/**
	 * Instantiates a new character stat DAO.
	 *
	 * @param version
	 *            the version
	 */
	public CharacterStatDAO(String version) {
		super(version, DataFileType.CharacterStat.toString());
	}

}
