/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.CharacterSkill;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class CharacterSkillDAO.
 */
public class CharacterSkillDAO extends BaseStaticDataDAO<CharacterSkill> {

	/**
	 * Instantiates a new character skill DAO.
	 *
	 * @param version
	 *            the version
	 */
	public CharacterSkillDAO(String version) {
		super(version, DataFileType.CharacterSkill.toString());
	}

}
