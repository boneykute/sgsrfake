/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Shop;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class ShopDAO.
 */
public class ShopDAO extends BaseStaticDataDAO<Shop> {

	/**
	 * Instantiates a new shop DAO.
	 *
	 * @param version
	 *            the version
	 */
	public ShopDAO(String version) {
		super(version, DataFileType.Shop.toString());
	}

}
