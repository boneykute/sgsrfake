/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.enumitem.ElementType;
import com.sgs.game.sgsr.server.dto.enumitem.RarityType;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.SecondaryRuneLevelData;

// TODO: Auto-generated Javadoc
/**
 * The Class SecondaryRune.
 */
public class SecondaryRune extends BaseStaticDataDTO<SecondaryRune> {

	/** The rarity. */
	private RarityType rarity;

	/** The element. */
	private ElementType element;

	/** The base stat. */
	private String baseStat;

	/** The total level. */
	private int totalLevel;

	/** The levels. */
	private List<SecondaryRuneLevelData> levels;

	/**
	 * Instantiates a new secondary rune.
	 */
	public SecondaryRune() {
		super();
	}

	/**
	 * Instantiates a new secondary rune.
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
	 * @param baseStat
	 *            the base stat
	 * @param totalLevel
	 *            the total level
	 * @param levels
	 *            the levels
	 */
	public SecondaryRune(int id, String name, String description, RarityType rarity, ElementType element,
			String baseStat, int totalLevel, List<SecondaryRuneLevelData> levels) {
		super(id, name, description);
		this.rarity = rarity;
		this.element = element;
		this.baseStat = baseStat;
		this.totalLevel = totalLevel;
		this.levels = levels;
	}

	/**
	 * Gets the rarity.
	 *
	 * @return the rarity
	 */
	public RarityType getRarity() {
		return rarity;
	}

	/**
	 * Sets the rarity.
	 *
	 * @param rarity
	 *            the new rarity
	 */
	public void setRarity(RarityType rarity) {
		this.rarity = rarity;
	}

	/**
	 * Gets the element.
	 *
	 * @return the element
	 */
	public ElementType getElement() {
		return element;
	}

	/**
	 * Sets the element.
	 *
	 * @param element
	 *            the new element
	 */
	public void setElement(ElementType element) {
		this.element = element;
	}

	/**
	 * Gets the base stat.
	 *
	 * @return the base stat
	 */
	public String getBaseStat() {
		return baseStat;
	}

	/**
	 * Sets the base stat.
	 *
	 * @param baseStat
	 *            the new base stat
	 */
	public void setBaseStat(String baseStat) {
		this.baseStat = baseStat;
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
	public List<SecondaryRuneLevelData> getLevels() {
		return levels;
	}

	/**
	 * Sets the levels.
	 *
	 * @param levels
	 *            the new levels
	 */
	public void setLevels(List<SecondaryRuneLevelData> levels) {
		this.levels = levels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	public SecondaryRune clone() {
		return new SecondaryRune(id, name, description, rarity, element, baseStat, totalLevel, levels);
	}

}
