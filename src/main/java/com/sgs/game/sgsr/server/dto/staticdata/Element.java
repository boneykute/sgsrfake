package com.sgs.game.sgsr.server.dto.staticdata;

public class Element extends BaseStaticDataDTO<Element> {

	public Element() {
		super();
	}

	public Element(int id, String name, String description) {
		super(id, name, description);
	}

	@Override
	protected Element clone() {
		return new Element(id, name, description);
	}

}
