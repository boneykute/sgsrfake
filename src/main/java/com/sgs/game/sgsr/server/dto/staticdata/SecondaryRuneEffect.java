/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class SecondaryRuneEffect.
 */
public class SecondaryRuneEffect extends BaseStaticDataDTO<SecondaryRuneEffect> {

	/** The rune 1. */
	private String rune1;

	/** The rune 2. */
	private String rune2;

	/** The rune 3. */
	private String rune3;

	/** The effect count. */
	private int effectCount;

	/** The effect type. */
	private String effectType;

	/** The effect amount. */
	private String effectAmount;

	/**
	 * Instantiates a new secondary rune effect.
	 */
	public SecondaryRuneEffect() {
		super();
	}

	/**
	 * Instantiates a new secondary rune effect.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param rune1
	 *            the rune 1
	 * @param rune2
	 *            the rune 2
	 * @param rune3
	 *            the rune 3
	 * @param effectCount
	 *            the effect count
	 * @param effectType
	 *            the effect type
	 * @param effectAmount
	 *            the effect amount
	 */
	public SecondaryRuneEffect(int id, String name, String description, String rune1, String rune2, String rune3,
			int effectCount, String effectType, String effectAmount) {
		super(id, name, description);
		this.rune1 = rune1;
		this.rune2 = rune2;
		this.rune3 = rune3;
		this.effectCount = effectCount;
		this.effectType = effectType;
		this.effectAmount = effectAmount;
	}

	/**
	 * Gets the rune 1.
	 *
	 * @return the rune 1
	 */
	public String getRune1() {
		return rune1;
	}

	/**
	 * Sets the rune 1.
	 *
	 * @param rune1
	 *            the new rune 1
	 */
	public void setRune1(String rune1) {
		this.rune1 = rune1;
	}

	/**
	 * Gets the rune 2.
	 *
	 * @return the rune 2
	 */
	public String getRune2() {
		return rune2;
	}

	/**
	 * Sets the rune 2.
	 *
	 * @param rune2
	 *            the new rune 2
	 */
	public void setRune2(String rune2) {
		this.rune2 = rune2;
	}

	/**
	 * Gets the rune 3.
	 *
	 * @return the rune 3
	 */
	public String getRune3() {
		return rune3;
	}

	/**
	 * Sets the rune 3.
	 *
	 * @param rune3
	 *            the new rune 3
	 */
	public void setRune3(String rune3) {
		this.rune3 = rune3;
	}

	/**
	 * Gets the effect count.
	 *
	 * @return the effect count
	 */
	public int getEffectCount() {
		return effectCount;
	}

	/**
	 * Sets the effect count.
	 *
	 * @param effectCount
	 *            the new effect count
	 */
	public void setEffectCount(int effectCount) {
		this.effectCount = effectCount;
	}

	/**
	 * Gets the effect type.
	 *
	 * @return the effect type
	 */
	public String getEffectType() {
		return effectType;
	}

	/**
	 * Sets the effect type.
	 *
	 * @param effectType
	 *            the new effect type
	 */
	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	/**
	 * Gets the effect amount.
	 *
	 * @return the effect amount
	 */
	public String getEffectAmount() {
		return effectAmount;
	}

	/**
	 * Sets the effect amount.
	 *
	 * @param effectAmount
	 *            the new effect amount
	 */
	public void setEffectAmount(String effectAmount) {
		this.effectAmount = effectAmount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected SecondaryRuneEffect clone() {
		return new SecondaryRuneEffect(id, name, description, rune1, rune2, rune3, effectCount, effectType,
				effectAmount);
	}

}
