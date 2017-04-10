/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.dynamicdata;

import com.smartfoxserver.v2.db.IDBManager;

/**
 * The Class DynamicDBUtil.
 */
public class DynamicDBUtil {

	/** The db manager. */
	private static IDBManager dbManager;

	/**
	 * Inits the.
	 *
	 * @param dbManager
	 *            the db manager
	 */
	public static void init(IDBManager dbManager) {
		DynamicDBUtil.setDbManager(dbManager);
	}

	/**
	 * Gets the db manager.
	 *
	 * @return the db manager
	 */
	// region GETTER AND SETTER
	public static IDBManager getDbManager() {
		return dbManager;
	}

	/**
	 * Sets the db manager.
	 *
	 * @param dbManager
	 *            the new db manager
	 */
	public static void setDbManager(IDBManager dbManager) {
		DynamicDBUtil.dbManager = dbManager;
	}
	// endregion GETTER AND SETTER
}
