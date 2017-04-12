/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.enumitem;

// TODO: Auto-generated Javadoc
/**
 * The Enum RequirementType.
 */
public enum RequirementType {

	/** The None. */
	None("None"),
	/** The Kills. */
	TotalKillsCount("TotalKillsCount"),

	/** The login count. */
	TotalLoginCount("TotalLoginCount"),

	/** The trophies count. */
	TotalTrophiesCount("TotalTrophiesCount");

	/** The name. */
	private final String name;

	/**
	 * Instantiates a new requirement type.
	 *
	 * @param str
	 *            the str
	 */
	private RequirementType(String str) {
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
	public RequirementType getEnumFromName(String name) {
		RequirementType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return RequirementType.None;
		}
		return type;
	}
}