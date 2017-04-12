/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.staticdata;

import java.util.HashMap;

import com.sgs.game.sgsr.server.dao.staticdata.BaseStaticDataDAO;
import com.sgs.game.sgsr.server.dao.staticdata.GlobalConfigDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class StaticDBDAOManager.
 */
public class StaticDBDAOManager {

	/** The DA os. */
	@SuppressWarnings("rawtypes")
	public static HashMap<String, BaseStaticDataDAO> DAOs;

	/**
	 * Gets the dao.
	 *
	 * @param version
	 *            the version
	 * @param key
	 *            the key
	 * @return the dao
	 */
	@SuppressWarnings("rawtypes")
	public static BaseStaticDataDAO getDAO(String version, String key) {
		String DAOKey = createDAOKey(version, key);
		return DAOs.get(DAOKey);
	}

	/**
	 * Creates the DAO.
	 *
	 * @param version
	 *            the version
	 * @param key
	 *            the key
	 * @return the base static data DAO
	 */
	@SuppressWarnings("rawtypes")
	public static BaseStaticDataDAO createDAO(String version, String key) {
		DataFileType type = DataFileType.getEnumFromName(key);
		BaseStaticDataDAO dao = null;
		switch (type) {
		case GlobalConfig:
			dao = new GlobalConfigDAO(version, key);
			break;
		default:
			break;
		}
		return dao;
	}

	/**
	 * Creates the DAO key.
	 *
	 * @param version
	 *            the version
	 * @param key
	 *            the key
	 * @return the string
	 */
	public static String createDAOKey(String version, String key) {
		return version + "-" + key;
	}

	/**
	 * Adds the DAO.
	 *
	 * @param version
	 *            the version
	 * @param key
	 *            the key
	 * @return the base static data DAO
	 */
	@SuppressWarnings("rawtypes")
	public static BaseStaticDataDAO addDAO(String version, String key) {
		BaseStaticDataDAO existedDAO = getDAO(version, key);
		if (existedDAO == null) {
			BaseStaticDataDAO dao = createDAO(version, key);
			DAOs.put(createDAOKey(version, key), dao);
			return dao;
		}
		return null;
	}
}
