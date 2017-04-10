/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class Faction.
 */
public class Faction extends BaseStaticDataDTO<Faction> {

	/**
	 * Instantiates a new faction.
	 */
	public Faction() {
		super();
	}

	/**
	 * Instantiates a new faction.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 */
	public Faction(int id, String name, String description) {
		super(id, name, description);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected Faction clone() {
		return new Faction(id, name, description);
	}

}
