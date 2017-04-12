/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.enumitem;

// TODO: Auto-generated Javadoc
/**
 * The Enum FactionType.
 */
public enum FactionType {

	/** The None. */
	None(0, "None"),
	/** The Faction 1. */
	Faction1(1, "Faction1"),
	/** The Faction 2. */
	Faction2(2, "Faction2"),
	/** The Faction 3. */
	Faction3(3, "Faction3");

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/**
	 * Instantiates a new faction type.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 */
	private FactionType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Equals name.
	 *
	 * @param otherName
	 *            the other name
	 * @return true, if successful
	 */
	public boolean equalsName(String otherName) {
		return name.equals(otherName);
	}

	/**
	 * Equals id.
	 *
	 * @param otherId
	 *            the other id
	 * @return true, if successful
	 */
	public boolean equalsId(int otherId) {
		return id == otherId;
	}

	/**
	 * Gets the id.
	 *
	 * @param name
	 *            the name
	 * @return the id
	 */
	public int getId(String name) {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the enum from name.
	 *
	 * @param name
	 *            the name
	 * @return the enum from name
	 */
	public FactionType getEnumFromName(String name) {
		FactionType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return FactionType.None;
		}
		return type;
	}
}
