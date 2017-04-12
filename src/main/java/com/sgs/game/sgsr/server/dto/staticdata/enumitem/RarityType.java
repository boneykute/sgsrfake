/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.enumitem;

// TODO: Auto-generated Javadoc
/**
 * The Enum RarityType.
 */
public enum RarityType {

	/** The None. */
	None(0, "None"),
	/** The Common. */
	Common(1, "Common"),
	/** The Rare. */
	Rare(2, "Rare"),
	/** The Epic. */
	Epic(3, "Epic"),
	/** The Legendary. */
	Legendary(4, "Legendary");

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/**
	 * Instantiates a new rarity type.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 */
	private RarityType(int id, String name) {
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
	public RarityType getEnumFromName(String name) {
		RarityType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return RarityType.None;
		}
		return type;
	}
}
