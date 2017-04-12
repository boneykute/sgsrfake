/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.enumitem;

// TODO: Auto-generated Javadoc
/**
 * The Enum RuneType.
 */
public enum RuneType {

	/** The None. */
	None(0, "None"),
	/** The Primary. */
	Primary(1, "Primary"),
	/** The Secondary. */
	Secondary(2, "Secondary");

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/**
	 * Instantiates a new rune type.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 */
	private RuneType(int id, String name) {
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
	public RuneType getEnumFromName(String name) {
		RuneType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return RuneType.None;
		}
		return type;
	}
}
