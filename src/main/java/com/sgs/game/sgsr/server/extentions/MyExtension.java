package com.sgs.game.sgsr.server.extentions;

import com.smartfoxserver.v2.extensions.SFSExtension;

public class MyExtension extends SFSExtension {

	public void init() {
		// TODO Auto-generated method stub
		trace("Hello new structure, this is my NEW Extension!");
		// Add a new Request Handler for client
		addRequestHandler("add", AddReqHandler.class);
	}

}
