/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.NickName;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class NickNameDAO.
 */
public class NickNameDAO extends BaseStaticDataDAO<NickName> {

	/**
	 * Instantiates a new nick name DAO.
	 *
	 * @param version
	 *            the version
	 */
	public NickNameDAO(String version) {
		super(version, DataFileType.NickName.toString());
	}

}
