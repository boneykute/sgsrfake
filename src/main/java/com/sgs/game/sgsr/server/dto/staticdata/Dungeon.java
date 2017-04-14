/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.subitem.DungeonLevelData;

// TODO: Auto-generated Javadoc
/**
 * The Class Dungeon.
 */
public class Dungeon extends BaseStaticDataDTO<Dungeon> {

	/** The total level. */
	private int totalLevel;

	/** The items. */
	private List<DungeonLevelData> levels;

	/**
	 * Instantiates a new dungeon.
	 */
	public Dungeon() {
		super();
	}

	/**
	 * Instantiates a new dungeon.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param totalLevel
	 *            the total level
	 * @param levels
	 *            the levels
	 */
	public Dungeon(int id, String name, String description, int totalLevel, List<DungeonLevelData> levels) {
		super(id, name, description);
		this.totalLevel = totalLevel;
		this.levels = levels;
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
	public List<DungeonLevelData> getLevels() {
		return levels;
	}

	/**
	 * Sets the levels.
	 *
	 * @param levels
	 *            the new levels
	 */
	public void setLevels(List<DungeonLevelData> levels) {
		this.levels = levels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	public Dungeon clone() {
		return new Dungeon(id, name, description, totalLevel, levels);
	}
}
