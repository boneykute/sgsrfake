/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.subitem.PrimaryRuneConfigLevelData;

// TODO: Auto-generated Javadoc
/**
 * The Class PrimaryRuneConfiguration.
 */
public class PrimaryRuneConfiguration extends BaseStaticDataDTO<PrimaryRuneConfiguration> {

	/** The rune id. */
	private int runeId;

	/** The star. */
	private int star;

	/** The total level. */
	private int totalLevel;

	/** The levels. */
	private List<PrimaryRuneConfigLevelData> levels;

	/**
	 * Instantiates a new primary rune configuration.
	 */
	public PrimaryRuneConfiguration() {
		super();
	}

	/**
	 * Instantiates a new primary rune configuration.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param runeId
	 *            the rune id
	 * @param star
	 *            the star
	 * @param totalLevel
	 *            the total level
	 * @param levels
	 *            the levels
	 */
	public PrimaryRuneConfiguration(int id, String name, String description, int runeId, int star, int totalLevel,
			List<PrimaryRuneConfigLevelData> levels) {
		super(id, name, description);
		this.runeId = runeId;
		this.star = star;
		this.totalLevel = totalLevel;
		this.levels = levels;
	}

	/**
	 * Gets the rune id.
	 *
	 * @return the rune id
	 */
	public int getRuneId() {
		return runeId;
	}

	/**
	 * Sets the rune id.
	 *
	 * @param runeId
	 *            the new rune id
	 */
	public void setRuneId(int runeId) {
		this.runeId = runeId;
	}

	/**
	 * Gets the star.
	 *
	 * @return the star
	 */
	public int getStar() {
		return star;
	}

	/**
	 * Sets the star.
	 *
	 * @param star
	 *            the new star
	 */
	public void setStar(int star) {
		this.star = star;
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
	public List<PrimaryRuneConfigLevelData> getLevels() {
		return levels;
	}

	/**
	 * Sets the levels.
	 *
	 * @param levels
	 *            the new levels
	 */
	public void setLevels(List<PrimaryRuneConfigLevelData> levels) {
		this.levels = levels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected PrimaryRuneConfiguration clone() {
		return new PrimaryRuneConfiguration(id, name, description, runeId, star, totalLevel, levels);
	}

}
