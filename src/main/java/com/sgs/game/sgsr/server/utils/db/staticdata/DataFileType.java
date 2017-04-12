/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Enum DataFileType.
 */
public enum DataFileType {

	/** The None. */
	None("None"),

	/** The Global config. */
	GlobalConfig("GlobalConfig"),

	/** The Element. */
	Element("Element"),

	/** The Faction. */
	Faction("Faction"),

	/** The Daily login reward. */
	DailyLoginReward("DailyLoginReward"),

	/** The Avatar. */
	Avatar("Avatar"),

	/** The Nick name. */
	NickName("NickName"),

	/** The Resource type. */
	ResourceType("ResourceType"),

	/** The Shop. */
	Shop("Shop"),

	/** The Chest. */
	Chest("Chest"),

	/** The Pack. */
	Pack("Pack"),

	/** The Decoration. */
	Decoration("Decoration"),

	/** The Booster. */
	Booster("Booster"),

	/** The Scroll. */
	Scroll("Scroll"),

	/** The Dungeon. */
	Dungeon("Dungeon"),

	/** The League. */
	League("League"),

	/** The Season. */
	Season("Season"),

	/** The Player level. */
	PlayerLevel("PlayerLevel"),

	/** The Character's stat. */
	CharacterStat("CharacterStat"),

	/** The Character's skills. */
	CharacterSkill("CharacterSkill"),

	/** The Building. */
	Building("Building"),

	/** The primary Rune. */
	PrimaryRune("PrimaryRune"),

	/** The primary Rune configuration. */
	PrimaryRuneConfiguration("PrimaryRuneConfiguration"),

	/** The secondary Rune. */
	SecondaryRune("SecondaryRune"),

	/** The secondary Rune effect configuration. */
	SecondaryRuneEffect("SecondaryRuneEffect");

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

	/**
	 * Gets the enum from name.
	 *
	 * @param name
	 *            the name
	 * @return the enum from name
	 */
	public static DataFileType getEnumFromName(String name) {
		DataFileType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return DataFileType.None;
		}
		return type;
	}
}
