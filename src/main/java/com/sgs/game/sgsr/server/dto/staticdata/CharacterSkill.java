/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.subitem.CharacterSkillLevelData;

// TODO: Auto-generated Javadoc
/**
 * The Class CharacterSkill.
 */
public class CharacterSkill extends BaseStaticDataDTO<CharacterSkill> {

	/** The type. */
	private String type;

	/** The skill type. */
	private String skillType;

	/** The Total skill level. */
	private int totalLevel;

	/** The levels. */
	private List<CharacterSkillLevelData> levels;

	/**
	 * Instantiates a new character skill.
	 */
	public CharacterSkill() {
		super();
	}

	/**
	 * Instantiates a new character skill.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param type
	 *            the type
	 * @param skillType
	 *            the skill type
	 * @param totalSkillLevel
	 *            the total skill level
	 * @param levels
	 *            the levels
	 */
	public CharacterSkill(int id, String name, String description, String type, String skillType, int totalSkillLevel,
			List<CharacterSkillLevelData> levels) {
		super(id, name, description);
		this.type = type;
		this.skillType = skillType;
		totalLevel = totalSkillLevel;
		this.levels = levels;
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
	 * Gets the skill type.
	 *
	 * @return the skill type
	 */
	public String getSkillType() {
		return skillType;
	}

	/**
	 * Sets the skill type.
	 *
	 * @param skillType
	 *            the new skill type
	 */
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	/**
	 * Gets the total skill level.
	 *
	 * @return the total skill level
	 */
	public int getTotalSkillLevel() {
		return totalLevel;
	}

	/**
	 * Sets the total skill level.
	 *
	 * @param totalSkillLevel
	 *            the new total skill level
	 */
	public void setTotalSkillLevel(int totalSkillLevel) {
		totalLevel = totalSkillLevel;
	}

	/**
	 * Gets the levels.
	 *
	 * @return the levels
	 */
	public List<CharacterSkillLevelData> getLevels() {
		return levels;
	}

	/**
	 * Sets the levels.
	 *
	 * @param levels
	 *            the new levels
	 */
	public void setLevels(List<CharacterSkillLevelData> levels) {
		this.levels = levels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	public CharacterSkill clone() {
		return new CharacterSkill(id, name, description, type, skillType, totalLevel, levels);
	}
}
