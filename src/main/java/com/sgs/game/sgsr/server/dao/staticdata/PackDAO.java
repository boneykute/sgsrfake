/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Pack;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class PackDAO.
 */
public class PackDAO extends BaseStaticDataDAO<Pack> {

	/**
	 * Instantiates a new pack DAO.
	 *
	 * @param version
	 *            the version
	 */
	public PackDAO(String version) {
		super(version, DataFileType.Pack.toString());
	}

}
