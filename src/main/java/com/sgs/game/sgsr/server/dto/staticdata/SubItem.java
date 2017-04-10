/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class SubItem.
 */
public class SubItem {

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/** The amount. */
	private int amount;

	/**
	 * Instantiates a new sub item.
	 */
	public SubItem() {
	}

	/**
	 * Instantiates a new sub item.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param amount
	 *            the amount
	 */
	public SubItem(int id, String name, int amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
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
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
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
}
