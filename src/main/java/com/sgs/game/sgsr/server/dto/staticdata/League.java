/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class League.
 */
public class League extends BaseStaticDataDTO<League> {

	/** The required trophies. */
	private int requiredTrophies;

	/** The demotion at. */
	private int demotionAt;

	/** The character unlock. */
	private List<String> characterUnlock;

	/**
	 * Instantiates a new league.
	 */
	public League() {
		super();
	}

	/**
	 * Instantiates a new league.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param requiredTrophies
	 *            the required trophies
	 * @param demotionAt
	 *            the demotion at
	 * @param characterUnlock
	 *            the character unlock
	 */
	public League(int id, String name, String description, int requiredTrophies, int demotionAt,
			List<String> characterUnlock) {
		super(id, name, description);
		this.requiredTrophies = requiredTrophies;
		this.demotionAt = demotionAt;
		this.characterUnlock = characterUnlock;
	}

	/**
	 * Gets the required trophies.
	 *
	 * @return the required trophies
	 */
	public int getRequiredTrophies() {
		return requiredTrophies;
	}

	/**
	 * Sets the required trophies.
	 *
	 * @param requiredTrophies
	 *            the new required trophies
	 */
	public void setRequiredTrophies(int requiredTrophies) {
		this.requiredTrophies = requiredTrophies;
	}

	/**
	 * Gets the demotion at.
	 *
	 * @return the demotion at
	 */
	public int getDemotionAt() {
		return demotionAt;
	}

	/**
	 * Sets the demotion at.
	 *
	 * @param demotionAt
	 *            the new demotion at
	 */
	public void setDemotionAt(int demotionAt) {
		this.demotionAt = demotionAt;
	}

	/**
	 * Gets the character unlock.
	 *
	 * @return the character unlock
	 */
	public List<String> getCharacterUnlock() {
		return characterUnlock;
	}

	/**
	 * Sets the character unlock.
	 *
	 * @param characterUnlock
	 *            the new character unlock
	 */
	public void setCharacterUnlock(List<String> characterUnlock) {
		this.characterUnlock = characterUnlock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	public League clone() {
		return new League(id, name, description, requiredTrophies, demotionAt, characterUnlock);
	}

}
