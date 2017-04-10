package com.sgs.game.sgsr.server.dto.staticdata;

public class GlobalConfig extends BaseStaticDataDTO<GlobalConfig> {

	public GlobalConfig() {
		super();
	}

	public GlobalConfig(int id, String name, String description) {
		super(id, name, description);
	}

	@Override
	protected GlobalConfig clone() {
		return new GlobalConfig(id, name, description);
	}
}
