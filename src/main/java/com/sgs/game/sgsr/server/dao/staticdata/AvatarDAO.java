/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Avatar;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class AvatarDAO.
 */
public class AvatarDAO extends BaseStaticDataDAO<Avatar> {

	/**
	 * Instantiates a new avatar DAO.
	 *
	 * @param version
	 *            the version
	 */
	public AvatarDAO(String version) {
		super(version, DataFileType.Avatar.toString());
	}

}
