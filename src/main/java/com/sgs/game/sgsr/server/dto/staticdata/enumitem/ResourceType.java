/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.enumitem;

// TODO: Auto-generated Javadoc
/**
 * The Enum ResourceType.
 */
public enum ResourceType {

	/** The None. */
	None(0, "None"),
	/** The Gold. */
	Gold(1, "Gold"),
	/** The Gem. */
	Gem(2, "Gem"),
	/** The Food. */
	Food(3, "Food"),
	/** The Fire crystal. */
	FireCrystal(4, "FireCrystal"),
	/** The Water crystal. */
	WaterCrystal(5, "WaterCrystal"),
	/** The Earth crystal. */
	EarthCrystal(6, "EarthCrystal"),
	/** The Light crystal. */
	LightCrystal(7, "LightCrystal"),
	/** The Dark crystal. */
	DarkCrystal(8, "DarkCrystal");

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/**
	 * Instantiates a new resource type.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 */
	private ResourceType(int id, String name) {
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
	public ResourceType getEnumFromName(String name) {
		ResourceType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return ResourceType.None;
		}
		return type;
	}
}
