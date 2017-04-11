/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class PrimaryRuneLevelData.
 */
public class PrimaryRuneLevelData {

	/** The id. */
	private int id;

	/** The total effect bonus. */
	private int totalEffectBonus;

	/** The effects. */
	private List<PrimaryRuneEffect> effects;

	/**
	 * Instantiates a new primary rune level data.
	 */
	public PrimaryRuneLevelData() {
	}

	/**
	 * Instantiates a new primary rune level data.
	 *
	 * @param id
	 *            the id
	 * @param totalEffectBonus
	 *            the total effect bonus
	 * @param effects
	 *            the effects
	 */
	public PrimaryRuneLevelData(int id, int totalEffectBonus, List<PrimaryRuneEffect> effects) {
		super();
		this.id = id;
		this.totalEffectBonus = totalEffectBonus;
		this.effects = effects;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the total effect bonus.
	 *
	 * @return the total effect bonus
	 */
	public int getTotalEffectBonus() {
		return totalEffectBonus;
	}

	/**
	 * Sets the total effect bonus.
	 *
	 * @param totalEffectBonus
	 *            the new total effect bonus
	 */
	public void setTotalEffectBonus(int totalEffectBonus) {
		this.totalEffectBonus = totalEffectBonus;
	}

	/**
	 * Gets the effects.
	 *
	 * @return the effects
	 */
	public List<PrimaryRuneEffect> getEffects() {
		return effects;
	}

	/**
	 * Sets the effects.
	 *
	 * @param effects
	 *            the new effects
	 */
	public void setEffects(List<PrimaryRuneEffect> effects) {
		this.effects = effects;
	}

}
