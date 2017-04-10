/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.handlers;

import java.util.HashMap;

import com.sgs.game.sgsr.server.handlers.req.BaseRequestHandler;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;

enum RequestHandlerType {
	type1("Type1"), type2("Type2");

	private final String name;

	private RequestHandlerType(String s) {
		name = s;
	}

	public boolean equalsName(String otherName) {
		return name.equals(otherName);
	}

	public String toString() {
		return this.name;
	}
}

/**
 * The Class RequestHandlerUtil.
 */
public class RequestHandlerUtil {

	/** The handlers. */
	private static HashMap<String, BaseClientRequestHandler> handlers;

	/**
	 * Inits stuff.
	 */
	public static void init() {
		handlers = new HashMap<String, BaseClientRequestHandler>();
		// Add all handler to a hashed map
		handlers.put(RequestHandlerType.type1.toString(), new BaseRequestHandler());
	}

	/**
	 * Gets the handlers.
	 *
	 * @return the handlers
	 */
	public static HashMap<String, BaseClientRequestHandler> getHandlers() {
		return handlers;
	}
}
