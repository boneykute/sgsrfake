/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.enumitem;

// TODO: Auto-generated Javadoc
/**
 * The Enum ElementType.
 */
public enum ElementType {

	/** The None. */
	None(0, "None"),
	/** The Fire. */
	Fire(1, "Fire"),
	/** The Water. */
	Water(2, "Water"),
	/** The Earth. */
	Earth(3, "Earth"),
	/** The Light. */
	Light(4, "Light"),
	/** The Dark. */
	Dark(5, "Dark");

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/**
	 * Instantiates a new element type.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 */
	private ElementType(int id, String name) {
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
	public ElementType getEnumFromName(String name) {
		ElementType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return ElementType.None;
		}
		return type;
	}
}
