/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.enumitem;

// TODO: Auto-generated Javadoc
/**
 * The Enum EffectType.
 */
public enum EffectType {

	/** The None. */
	None("None"),
	/** The ATK damage flat. */
	ATKDamageFlat("ATKDamageFlat"),
	/** The ATK damage percent. */
	ATKDamagePercent("ATKDamagePercent"),
	/** The ATK speed flat. */
	ATKSpeedFlat("ATKSpeedFlat"),
	/** The ATK speed percent. */
	ATKSpeedPercent("ATKSpeedPercent"),
	/** The Stun. */
	Stun("Stun");

	/** The name. */
	private String name;

	/**
	 * Instantiates a new effect type.
	 *
	 * @param name
	 *            the name
	 */
	private EffectType(String name) {
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
	public EffectType getEnumFromName(String name) {
		EffectType type;
		try {
			type = valueOf(name);
		} catch (Exception e) {
			return EffectType.None;
		}
		return type;
	}
}
