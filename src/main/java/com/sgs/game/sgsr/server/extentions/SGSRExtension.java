package com.sgs.game.sgsr.server.extentions;

import java.util.Iterator;
import java.util.Map;

import com.sgs.game.sgsr.server.handlers.evt.BaseEventHandler;
import com.sgs.game.sgsr.server.utils.DBUtil;
import com.sgs.game.sgsr.server.utils.handlers.EventHandlerUtil;
import com.sgs.game.sgsr.server.utils.handlers.RequestHandlerUtil;
import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;
import com.smartfoxserver.v2.extensions.SFSExtension;

/**
 * Main extention
 *
 */
public class SGSRExtension extends SFSExtension {

	public void init() {
		// Init db manager
		DBUtil.dbManager = getParentZone().getDBManager();

		// Init all request handlers
		initRequestHandlers();

		// Init all event hanlders
		initEventHandlers();
	}

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

	private void initRequestHandlers() {
		RequestHandlerUtil.init();
		Iterator<?> it = RequestHandlerUtil.getHandlers().entrySet().iterator();
		while (it.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, BaseClientRequestHandler> pair = (Map.Entry<String, BaseClientRequestHandler>) it.next();
			addRequestHandler(pair.getKey(), pair.getValue());
		}
	}

	@Override
	public void destroy() {
		super.destroy();
	}
}
