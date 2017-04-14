/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

// TODO: Auto-generated Javadoc
/**
 * The Class DungeoneonItem.
 */
public class DungeonItem {

	/** The type. */
	private String type;

	/** The min. */
	private int min;

	/** The max. */
	private int max;

	/**
	 * Instantiates a new dungeon item.
	 *
	 * @param type
	 *            the type
	 * @param min
	 *            the min
	 * @param max
	 *            the max
	 */
	public DungeonItem(String type, int min, int max) {
		super();
		this.type = type;
		this.min = min;
		this.max = max;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type
	 *            the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the min.
	 *
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * Sets the min.
	 *
	 * @param min
	 *            the new min
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * Gets the max.
	 *
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * Sets the max.
	 *
	 * @param max
	 *            the new max
	 */
	public void setMax(int max) {
		this.max = max;
	}

}
