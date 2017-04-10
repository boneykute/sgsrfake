/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.handlers;

import java.util.HashMap;

import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class EventHandlerUtil.
 */
public class EventHandlerUtil {

	/** The handlers. */
	private static HashMap<SFSEventType, Class<BaseServerEventHandler>> handlers;

	/**
	 * Inits stuff.
	 */
	public static void init() {
		// Add all handler to a hashed map
		handlers = new HashMap<SFSEventType, Class<BaseServerEventHandler>>();
		handlers.put(SFSEventType.USER_LOGIN, BaseServerEventHandler.class);
	}

	/**
	 * Gets the handlers.
	 *
	 * @return the handlers
	 */
	public static HashMap<SFSEventType, Class<BaseServerEventHandler>> getHandlers() {
		return handlers;
	}
}
