/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.staticdata;

/**
 * The Enum DataFileType.
 */
public enum DataFileType {

	None("None"),

	GlobalConfig("GlobalConfig"),

	Element("Element"),

	Faction("Faction"),

	DailyLoginReward("DailyLoginReward"),

	Avatar("Avatar"),

	NickName("NickName"),

	ResourceType("ResourceType"),

	Shop("Shop"),

	/** The Chest. */
	Chest("Chest"),

	/** The Pack. */
	Pack("Pack"),

	Decoration("Decoration"),

	Booster("Booster"),

	Scroll("Scroll"),

	Dungeon("Dungeon"),

	League("League"),

	Season("Season"),

	PlayerLevel("PlayerLevel"),

	/** The Character's stat. */
	CharacterStat("CharacterStat"),

	/** The Character's skills */
	CharacterSkill("CharacterSkill"),

	/** The Building. */
	Building("Building"),

	/** The primary Rune. */
	PrimaryRune("PrimaryRune"),

	/** The primary Rune configuration. */
	PrimaryRuneConfiguration("PrimaryRuneConfiguration"),

	/** The secondary Rune. */
	SecondaryRune("SecondaryRune"),

	/** The secondary Rune configuration. */
	SecondaryRuneConfiguration("SecondaryRuneConfiguration"),

	/** The secondary Rune effect configuration. */
	SecondaryRuneEffectConfiguration("SecondaryRuneEffectConfiguration");

	/** The name. */
	private final String name;

	/**
	 * Instantiates a new data file type.
	 *
	 * @param str
	 *            the str
	 */
	private DataFileType(String str) {
		name = str;
	}

	/**
	 * Equals name.
	 *
	 * @param otherName
	 *            the other name
	 * @return true, if successful
	 */
	public boolean equalsName(final String otherName) {
		return name.equals(otherName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return this.name;
	}
}
