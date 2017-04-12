/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Decoration;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class DecorationDAO.
 */
public class DecorationDAO extends BaseStaticDataDAO<Decoration> {

	/**
	 * Instantiates a new decoration DAO.
	 *
	 * @param version
	 *            the version
	 */
	public DecorationDAO(String version) {
		super(version, DataFileType.Decoration.toString());
	}

}
