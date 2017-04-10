/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.extentions;

import com.smartfoxserver.v2.extensions.SFSExtension;

// TODO: Auto-generated Javadoc
/**
 * The Class MyExtension.
 */
public class MyExtension extends SFSExtension {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.smartfoxserver.v2.extensions.ISFSExtension#init()
	 */
	public void init() {
		// TODO Auto-generated method stub
		trace("Hello new structure, this is my NEW Extension!");
		// Add a new Request Handler for client
		addRequestHandler("add", AddReqHandler.class);
	}

}
