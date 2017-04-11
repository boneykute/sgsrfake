/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.subitem.CharacterStatLevelData;

// TODO: Auto-generated Javadoc
/**
 * The Class CharacterStat.
 */
public class CharacterStat extends BaseStaticDataDTO<CharacterStat> {

	/** The role. */
	private String role;

	/** The rarity. */
	private String rarity;

	/** The element. */
	private String element;

	/** The base level. */
	private int baseLevel;

	/** The base star. */
	private int baseStar;

	/** The total level. */
	private int totalLevel;

	/** The levels. */
	private List<CharacterStatLevelData> levels;

	/**
	 * Instantiates a new character stat.
	 */
	public CharacterStat() {
		super();
	}

	/**
	 * Instantiates a new character stat.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param role
	 *            the role
	 * @param rarity
	 *            the rarity
	 * @param element
	 *            the element
	 * @param baseLevel
	 *            the base level
	 * @param baseStar
	 *            the base star
	 * @param totalLevel
	 *            the total level
	 * @param levels
	 *            the levels
	 */
	public CharacterStat(int id, String name, String description, String role, String rarity, String element,
			int baseLevel, int baseStar, int totalLevel, List<CharacterStatLevelData> levels) {
		super(id, name, description);
		this.role = role;
		this.rarity = rarity;
		this.element = element;
		this.baseLevel = baseLevel;
		this.baseStar = baseStar;
		this.totalLevel = totalLevel;
		this.levels = levels;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role
	 *            the new role
	 */
	public void setRole(String role) {
		this.role = role;
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
	 * Gets the base level.
	 *
	 * @return the base level
	 */
	public int getBaseLevel() {
		return baseLevel;
	}

	/**
	 * Sets the base level.
	 *
	 * @param baseLevel
	 *            the new base level
	 */
	public void setBaseLevel(int baseLevel) {
		this.baseLevel = baseLevel;
	}

	/**
	 * Gets the base star.
	 *
	 * @return the base star
	 */
	public int getBaseStar() {
		return baseStar;
	}

	/**
	 * Sets the base star.
	 *
	 * @param baseStar
	 *            the new base star
	 */
	public void setBaseStar(int baseStar) {
		this.baseStar = baseStar;
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
	public List<CharacterStatLevelData> getLevels() {
		return levels;
	}

	/**
	 * Sets the levels.
	 *
	 * @param levels
	 *            the new levels
	 */
	public void setLevels(List<CharacterStatLevelData> levels) {
		this.levels = levels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected CharacterStat clone() {
		return new CharacterStat(id, name, description, role, rarity, element, baseLevel, baseStar, totalLevel, levels);
	}

}
