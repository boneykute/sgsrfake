package com.sgs.game.sgsr.server.utils.db;

import com.smartfoxserver.v2.db.IDBManager;

public class DynamicDBUtil {
	private static IDBManager dbManager;
	
	public static void init(IDBManager dbManager) {
		DynamicDBUtil.dbManager = dbManager;
	}
}	        
