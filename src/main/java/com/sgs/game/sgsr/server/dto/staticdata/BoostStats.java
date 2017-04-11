/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class BoostStats.
 */
public class BoostStats {

	/** The name. */
	private String name;

	/** The amount percent. */
	private float amountPercent;

	/** The amount flat. */
	private float amountFlat;

	/**
	 * Instantiates a new boost stats.
	 */
	public BoostStats() {
	}

	/**
	 * Instantiates a new boost stats.
	 *
	 * @param name
	 *            the name
	 * @param amountPercent
	 *            the amount percent
	 * @param amountFlat
	 *            the amount flat
	 */
	public BoostStats(String name, float amountPercent, float amountFlat) {
		this.name = name;
		this.amountPercent = amountPercent;
		this.amountFlat = amountFlat;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the amount percent.
	 *
	 * @return the amount percent
	 */
	public float getAmountPercent() {
		return amountPercent;
	}

	/**
	 * Sets the amount percent.
	 *
	 * @param amountPercent
	 *            the new amount percent
	 */
	public void setAmountPercent(float amountPercent) {
		this.amountPercent = amountPercent;
	}

	/**
	 * Gets the amount flat.
	 *
	 * @return the amount flat
	 */
	public float getAmountFlat() {
		return amountFlat;
	}

	/**
	 * Sets the amount flat.
	 *
	 * @param amountFlat
	 *            the new amount flat
	 */
	public void setAmountFlat(float amountFlat) {
		this.amountFlat = amountFlat;
	}
}
