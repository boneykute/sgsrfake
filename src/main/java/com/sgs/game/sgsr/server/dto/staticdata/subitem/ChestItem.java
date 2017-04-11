/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

// TODO: Auto-generated Javadoc
/**
 * The Class ChestItem.
 */
public class ChestItem {

	/** The type. */
	private String type;

	/** The min. */
	private int min;

	/** The max. */
	private int max;

	/** The guaranteed rate. */
	private int guaranteedRate;;

	/** The guaranteed epic. */
	private int guaranteedEpic;

	/** The guaranteed legendary. */
	private int guaranteedLegendary;

	/** The percent bonus rare. */
	private float percentBonusRare;

	/** The percent bonus epic. */
	private float percentBonusEpic;

	/** The percent bonus legendary. */
	private float percentBonusLegendary;

	/**
	 * Instantiates a new chest item.
	 */
	public ChestItem() {
	}

	/**
	 * Instantiates a new chest item.
	 *
	 * @param type
	 *            the type
	 * @param min
	 *            the min
	 * @param max
	 *            the max
	 * @param guaranteedRate
	 *            the guaranteed rate
	 * @param guaranteedEpic
	 *            the guaranteed epic
	 * @param guaranteedLegendary
	 *            the guaranteed legendary
	 * @param percentBonusRare
	 *            the percent bonus rare
	 * @param percentBonusEpic
	 *            the percent bonus epic
	 * @param percentBonusLegendary
	 *            the percent bonus legendary
	 */
	public ChestItem(String type, int min, int max, int guaranteedRate, int guaranteedEpic, int guaranteedLegendary,
			float percentBonusRare, float percentBonusEpic, float percentBonusLegendary) {
		this.type = type;
		this.min = min;
		this.max = max;
		this.guaranteedRate = guaranteedRate;
		this.guaranteedEpic = guaranteedEpic;
		this.guaranteedLegendary = guaranteedLegendary;
		this.percentBonusRare = percentBonusRare;
		this.percentBonusEpic = percentBonusEpic;
		this.percentBonusLegendary = percentBonusLegendary;
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

	/**
	 * Gets the guaranteed rate.
	 *
	 * @return the guaranteed rate
	 */
	public int getGuaranteedRate() {
		return guaranteedRate;
	}

	/**
	 * Sets the guaranteed rate.
	 *
	 * @param guaranteedRate
	 *            the new guaranteed rate
	 */
	public void setGuaranteedRate(int guaranteedRate) {
		this.guaranteedRate = guaranteedRate;
	}

	/**
	 * Gets the guaranteed epic.
	 *
	 * @return the guaranteed epic
	 */
	public int getGuaranteedEpic() {
		return guaranteedEpic;
	}

	/**
	 * Sets the guaranteed epic.
	 *
	 * @param guaranteedEpic
	 *            the new guaranteed epic
	 */
	public void setGuaranteedEpic(int guaranteedEpic) {
		this.guaranteedEpic = guaranteedEpic;
	}

	/**
	 * Gets the guaranteed legendary.
	 *
	 * @return the guaranteed legendary
	 */
	public int getGuaranteedLegendary() {
		return guaranteedLegendary;
	}

	/**
	 * Sets the guaranteed legendary.
	 *
	 * @param guaranteedLegendary
	 *            the new guaranteed legendary
	 */
	public void setGuaranteedLegendary(int guaranteedLegendary) {
		this.guaranteedLegendary = guaranteedLegendary;
	}

	/**
	 * Gets the percent bonus rare.
	 *
	 * @return the percent bonus rare
	 */
	public float getPercentBonusRare() {
		return percentBonusRare;
	}

	/**
	 * Sets the percent bonus rare.
	 *
	 * @param percentBonusRare
	 *            the new percent bonus rare
	 */
	public void setPercentBonusRare(float percentBonusRare) {
		this.percentBonusRare = percentBonusRare;
	}

	/**
	 * Gets the percent bonus epic.
	 *
	 * @return the percent bonus epic
	 */
	public float getPercentBonusEpic() {
		return percentBonusEpic;
	}

	/**
	 * Sets the percent bonus epic.
	 *
	 * @param percentBonusEpic
	 *            the new percent bonus epic
	 */
	public void setPercentBonusEpic(float percentBonusEpic) {
		this.percentBonusEpic = percentBonusEpic;
	}

	/**
	 * Gets the percent bonus legendary.
	 *
	 * @return the percent bonus legendary
	 */
	public float getPercentBonusLegendary() {
		return percentBonusLegendary;
	}

	/**
	 * Sets the percent bonus legendary.
	 *
	 * @param percentBonusLegendary
	 *            the new percent bonus legendary
	 */
	public void setPercentBonusLegendary(float percentBonusLegendary) {
		this.percentBonusLegendary = percentBonusLegendary;
	}
}
