/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.extentions;

import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;

public class AddReqHandler extends BaseClientRequestHandler {

	@Override
	public void handleClientRequest(User sender, ISFSObject params) {
		// Get the client parameters
		int n1 = params.getInt("n1");
		int n2 = params.getInt("n2");

		// Create a response object
		ISFSObject resObj = SFSObject.newInstance();
		resObj.putBool("success", true);
		resObj.putShort("errorCode", (short) -1);
		resObj.putInt("result", n1 + n2);

		// Send it back to client
		send("add", resObj, sender);
	}

}
