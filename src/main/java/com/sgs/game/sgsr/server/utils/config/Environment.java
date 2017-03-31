package com.sgs.game.sgsr.server.utils.config;

import java.util.Properties;

import com.sgs.game.sgsr.server.utils.PropertiesUtil;
import com.sgs.game.sgsr.server.utils.config.Constants.ENV;

public class Environment {
	private String name;
	private DB db;

	private class DB {
		public String dbname;
		public String dbpass;

		public DB(String dbname, String dbpass) {
			this.dbname = dbname;
			this.dbpass = dbpass;
		}

		@Override
		public String toString() {
			return "DB: " + dbname + " -> " + dbpass;
		}
	}

	public Environment(ENV env) {
		// Read environment file
		Properties prop = new Properties();
		switch (env) {
		case DEV:
			prop = PropertiesUtil.read(ClassLoader.getSystemClassLoader(), "dev.properties");
			break;
		case TEST:
			prop = PropertiesUtil.read(ClassLoader.getSystemClassLoader(), "test.properties");
			break;
		case PROD:
			prop = PropertiesUtil.read(ClassLoader.getSystemClassLoader(), "prod.properties");
			break;
		}

		// Assign environment name
		this.name = prop.getProperty("envname");
		
		// Assign environment db
		String dbname = prop.getProperty("dbname");
		String dbpass = prop.getProperty("dbpass");
		this.db = new DB(dbname, dbpass);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DB getDb() {
		return db;
	}

	public void setDb(DB db) {
		this.db = db;
	}
}
