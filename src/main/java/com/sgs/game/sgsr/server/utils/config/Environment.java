/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.config;

import java.util.Properties;

import com.sgs.game.sgsr.server.utils.PropertiesUtil;
import com.sgs.game.sgsr.server.utils.config.Constants.ENVIRONMENT;

// TODO: Auto-generated Javadoc
/**
 * The Class Environment.
 */
public class Environment {

	/** The environment name. */
	private String name;

	/** The db info. */
	private DB db;

	/**
	 * The inner Class DB.
	 */
	private class DB {

		/** The db name. */
		public String dbname;

		/** The db password. */
		public String dbpass;

		/**
		 * Instantiates a new db.
		 *
		 * @param dbname
		 *            the db name
		 * @param dbpass
		 *            the db password
		 */
		public DB(String dbname, String dbpass) {
			this.dbname = dbname;
			this.dbpass = dbpass;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "DB: " + dbname + " -> " + dbpass;
		}
	}

	/**
	 * Instantiates a new environment.
	 *
	 * @param environment
	 *            the environment
	 */
	public Environment(ENVIRONMENT environment) {
		// Read environment file
		Properties prop = new Properties();
		switch (environment) {
		case DEV:
			prop = PropertiesUtil.readPropertiesFile(ClassLoader.getSystemClassLoader(), "dev.properties");
			break;
		case TEST:
			prop = PropertiesUtil.readPropertiesFile(ClassLoader.getSystemClassLoader(), "test.properties");
			break;
		case PROD:
			prop = PropertiesUtil.readPropertiesFile(ClassLoader.getSystemClassLoader(), "prod.properties");
			break;
		}

		// Assign environment name
		this.name = prop.getProperty("envname");

		// Assign environment db
		String dbname = prop.getProperty("dbname");
		String dbpass = prop.getProperty("dbpass");
		this.db = new DB(dbname, dbpass);
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the db.
	 *
	 * @return the db
	 */
	public DB getDb() {
		return db;
	}

	/**
	 * Sets the db.
	 *
	 * @param db
	 *            the new db
	 */
	public void setDb(DB db) {
		this.db = db;
	}
}
