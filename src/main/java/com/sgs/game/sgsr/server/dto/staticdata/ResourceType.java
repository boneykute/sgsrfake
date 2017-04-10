package com.sgs.game.sgsr.server.dto.staticdata;

public class ResourceType extends BaseStaticDataDTO<ResourceType> {

	public ResourceType() {
		super();
	}

	public ResourceType(int id, String name, String description) {
		super(id, name, description);
	}

	@Override
	protected ResourceType clone() {
		return new ResourceType(id, name, description);
	}

}
