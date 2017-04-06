/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db;

// TODO: Auto-generated Javadoc
/**
 * The Enum DataFileType.
 */
public enum DataFileType {

	/** The Character. */
	Character("Character"),

	/** The Building. */
	Building("Building"),

	/** The Rune. */
	Rune("Rune"),

	/** The Chest. */
	Chest("Chest"),

	/** The Pack. */
	Pack("Pack");

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
