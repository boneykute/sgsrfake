/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Scroll;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class ScrollDAO.
 */
public class ScrollDAO extends BaseStaticDataDAO<Scroll> {

	/**
	 * Instantiates a new scroll DAO.
	 *
	 * @param version
	 *            the version
	 */
	public ScrollDAO(String version) {
		super(version, DataFileType.Scroll.toString());
	}

}
