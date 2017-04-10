/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.extentions;

import java.util.Iterator;
import java.util.Map;

import com.sgs.game.sgsr.server.handlers.evt.BaseEventHandler;
import com.sgs.game.sgsr.server.utils.FileUtil;
import com.sgs.game.sgsr.server.utils.TimeUtil;
import com.sgs.game.sgsr.server.utils.db.dynamicdata.DynamicDBUtil;
import com.sgs.game.sgsr.server.utils.db.staticdata.StaticDBUtil;
import com.sgs.game.sgsr.server.utils.handlers.EventHandlerUtil;
import com.sgs.game.sgsr.server.utils.handlers.RequestHandlerUtil;
import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;
import com.smartfoxserver.v2.extensions.SFSExtension;

/**
 * The Class SGSRExtension.
 */
public class SGSRExtension extends SFSExtension {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.smartfoxserver.v2.extensions.ISFSExtension#init()
	 */
	public void init() {
		// Init helper
		FileUtil.init();
		TimeUtil.init();

		DynamicDBUtil.init(getParentZone().getDBManager());
		StaticDBUtil.init();

		// Init all request handlers
		initRequestHandlers();

		// Init all event hanlders
		initEventHandlers();

		// Download static data
		StaticDBUtil.downloadDataFirstTime();
	}

	/**
	 * Inits the event handlers.
	 */
	private void initEventHandlers() {
		EventHandlerUtil.init();
		Iterator<?> it = EventHandlerUtil.getHandlers().entrySet().iterator();
		while (it.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<SFSEventType, Class<BaseEventHandler>> pair = (Map.Entry<SFSEventType, Class<BaseEventHandler>>) it
					.next();
			addEventHandler(pair.getKey(), pair.getValue());
			it.remove();
		}
	}

	/**
	 * Inits the request handlers.
	 */
	private void initRequestHandlers() {
		RequestHandlerUtil.init();
		Iterator<?> it = RequestHandlerUtil.getHandlers().entrySet().iterator();
		while (it.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, BaseClientRequestHandler> pair = (Map.Entry<String, BaseClientRequestHandler>) it.next();
			addRequestHandler(pair.getKey(), pair.getValue());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.smartfoxserver.v2.extensions.SFSExtension#destroy()
	 */
	@Override
	public void destroy() {
		super.destroy();
	}
}
