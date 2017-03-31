package com.sgs.game.sgsr.server.utils.handlers;

import java.util.HashMap;

import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

public class EventHandlerUtil {
	private static HashMap<SFSEventType, Class<BaseServerEventHandler>> handlers;

	public static void init() {
		// Add all handler to a hashed map
		handlers = new HashMap<SFSEventType, Class<BaseServerEventHandler>>();
		handlers.put(SFSEventType.USER_LOGIN, BaseServerEventHandler.class);
	}

	public static HashMap<SFSEventType, Class<BaseServerEventHandler>> getHandlers() {
		return handlers;
	}
}
