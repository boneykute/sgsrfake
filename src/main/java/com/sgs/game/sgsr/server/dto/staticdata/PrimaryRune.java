/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.subitem.PrimaryRuneLevelData;

// TODO: Auto-generated Javadoc
/**
 * The Class PrimaryRune.
 */
public class PrimaryRune extends BaseStaticDataDTO<PrimaryRune> {

	/** The rarity. */
	private String rarity;

	/** The element. */
	private String element;

	/** The star number. */
	private int starNumber;

	/** The total level. */
	private int totalLevel;

	/** The levels. */
	private List<PrimaryRuneLevelData> levels;

	/**
	 * Instantiates a new primary rune.
	 */
	public PrimaryRune() {
		super();
	}

	/**
	 * Instantiates a new primary rune.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param rarity
	 *            the rarity
	 * @param element
	 *            the element
	 * @param starNumber
	 *            the star number
	 * @param totalLevel
	 *            the total level
	 * @param levels
	 *            the levels
	 */
	public PrimaryRune(int id, String name, String description, String rarity, String element, int starNumber,
			int totalLevel, List<PrimaryRuneLevelData> levels) {
		super(id, name, description);
		this.rarity = rarity;
		this.element = element;
		this.starNumber = starNumber;
		this.totalLevel = totalLevel;
		this.levels = levels;
	}

	/**
	 * Gets the rarity.
	 *
	 * @return the rarity
	 */
	public String getRarity() {
		return rarity;
	}

	/**
	 * Sets the rarity.
	 *
	 * @param rarity
	 *            the new rarity
	 */
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	/**
	 * Gets the element.
	 *
	 * @return the element
	 */
	public String getElement() {
		return element;
	}

	/**
	 * Sets the element.
	 *
	 * @param element
	 *            the new element
	 */
	public void setElement(String element) {
		this.element = element;
	}

	/**
	 * Gets the star number.
	 *
	 * @return the star number
	 */
	public int getStarNumber() {
		return starNumber;
	}

	/**
	 * Sets the star number.
	 *
	 * @param starNumber
	 *            the new star number
	 */
	public void setStarNumber(int starNumber) {
		this.starNumber = starNumber;
	}

	/**
	 * Gets the total level.
	 *
	 * @return the total level
	 */
	public int getTotalLevel() {
		return totalLevel;
	}

	/**
	 * Sets the total level.
	 *
	 * @param totalLevel
	 *            the new total level
	 */
	public void setTotalLevel(int totalLevel) {
		this.totalLevel = totalLevel;
	}

	/**
	 * Gets the levels.
	 *
	 * @return the levels
	 */
	public List<PrimaryRuneLevelData> getLevels() {
		return levels;
	}

	/**
	 * Sets the levels.
	 *
	 * @param levels
	 *            the new levels
	 */
	public void setLevels(List<PrimaryRuneLevelData> levels) {
		this.levels = levels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected PrimaryRune clone() {
		return new PrimaryRune(id, name, description, rarity, element, starNumber, totalLevel, levels);
	}

}
