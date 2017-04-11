/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerLevel.
 */
public class PlayerLevel extends BaseStaticDataDTO<PlayerLevel> {

	/** The required EXP. */
	private int requiredEXP;

	/**
	 * Instantiates a new player level.
	 */
	public PlayerLevel() {
		super();
	}

	/**
	 * Instantiates a new player level.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param requiredEXP
	 *            the required EXP
	 */
	public PlayerLevel(int id, String name, String description, int requiredEXP) {
		super(id, name, description);
		this.requiredEXP = requiredEXP;
	}

	/**
	 * Gets the required EXP.
	 *
	 * @return the required EXP
	 */
	public int getRequiredEXP() {
		return requiredEXP;
	}

	/**
	 * Sets the required EXP.
	 *
	 * @param requiredEXP
	 *            the new required EXP
	 */
	public void setRequiredEXP(int requiredEXP) {
		this.requiredEXP = requiredEXP;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected PlayerLevel clone() {
		return new PlayerLevel(id, name, description, requiredEXP);
	}

}
