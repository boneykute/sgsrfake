/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

import com.sgs.game.sgsr.server.dto.enumitem.RequirementType;

// TODO: Auto-generated Javadoc
/**
 * The Class Requirement.
 */
public class Requirement {

	/** The items. */
	private int amount;

	/** The type. */
	private RequirementType type;

	/**
	 * Instantiates a new requirement.
	 *
	 * @param amount
	 *            the amount
	 * @param type
	 *            the type
	 */
	public Requirement(int amount, RequirementType type) {
		this.amount = amount;
		this.type = type;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount
	 *            the new amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public RequirementType getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type
	 *            the new type
	 */
	public void setType(RequirementType type) {
		this.type = type;
	}
}
