/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import com.sgs.game.sgsr.server.dto.staticdata.Dungeon;
import com.sgs.game.sgsr.server.utils.db.staticdata.DataFileType;

// TODO: Auto-generated Javadoc
/**
 * The Class DungeonDAO.
 */
public class DungeonDAO extends BaseStaticDataDAO<Dungeon> {

	/**
	 * Instantiates a new dungeon DAO.
	 *
	 * @param version
	 *            the version
	 */
	public DungeonDAO(String version) {
		super(version, DataFileType.Dungeon.toString());
	}
}
