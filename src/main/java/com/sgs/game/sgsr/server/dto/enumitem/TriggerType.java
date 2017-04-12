/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.enumitem;

// TODO: Auto-generated Javadoc
/**
 * The Enum TriggerType.
 */
public enum TriggerType {

	/** The None. */
	None("None"),
	/** The On kill. */
	OnKill("OnKill"),
	/** The On attack. */
	OnAttack("OnAttack"),
	/** The On death. */
	OnDeath("OnDeath");

	/** The name. */
	private String name;

	/**
	 * Instantiates a new trigger type.
	 *
	 * @param name
	 *            the name
	 */
	private TriggerType(String name) {
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
	public TriggerType getEnumFromName(String name) {
		TriggerType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return TriggerType.None;
		}
		return type;
	}
}
