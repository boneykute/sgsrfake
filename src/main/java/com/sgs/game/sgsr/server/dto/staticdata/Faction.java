package com.sgs.game.sgsr.server.dto.staticdata;

public class Faction extends BaseStaticDataDTO<Faction> {

	public Faction() {
		super();
	}

	public Faction(int id, String name, String description) {
		super(id, name, description);
	}

	@Override
	protected Faction clone() {
		return new Faction(id, name, description);
	}

}
