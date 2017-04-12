/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.enumitem;

// TODO: Auto-generated Javadoc
/**
 * The Enum TargetType.
 */
public enum TargetType {

	/** The None. */
	None("None"),
	/** The Owner. */
	Owner("Owner"),
	/** The Party. */
	Party("Party"),
	/** The Enemy. */
	Enemy("Enemy");

	/** The name. */
	private String name;

	/**
	 * Instantiates a new target type.
	 *
	 * @param name
	 *            the name
	 */
	private TargetType(String name) {
		this.name = name;
	}

	/**
	 * Checks if is equal name.
	 *
	 * @param otherName
	 *            the other name
	 * @return true, if is equal name
	 */
	public boolean isEqualName(String otherName) {
		return name.equals(otherName);
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
	public TargetType getEnumFromName(String name) {
		TargetType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return TargetType.None;
		}
		return type;
	}
}
