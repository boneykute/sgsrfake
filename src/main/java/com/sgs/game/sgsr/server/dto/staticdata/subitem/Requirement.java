/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

// TODO: Auto-generated Javadoc
/**
 * The Class Requirement.
 */
public class Requirement {

	/**
	 * The Enum RequirementType.
	 */
	enum RequirementType {

		/** The Kills. */
		TotalKillsCount("TotalKillsCount"),

		/** The login count. */
		TotalLoginCount("TotalLoginCount"),

		/** The trophies count. */
		TotalTrophiesCount("TotalTrophiesCount");

		/** The name. */
		private final String name;

		/**
		 * Instantiates a new requirement type.
		 *
		 * @param str
		 *            the str
		 */
		private RequirementType(String str) {
			name = str;
		}

		/**
		 * Equals name.
		 *
		 * @param otherName
		 *            the other name
		 * @return true, if successful
		 */
		public boolean equalsName(final String otherName) {
			return name.equals(otherName);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Enum#toString()
		 */
		public String toString() {
			return this.name;
		}
	}

	/** The items. */
	private int items;

	/** The type. */
	private RequirementType type;

	/**
	 * Instantiates a new requirement.
	 *
	 * @param items
	 *            the items
	 * @param type
	 *            the type
	 */
	public Requirement(int items, RequirementType type) {
		this.setItems(items);
		this.setType(type);
	}

	/**
	 * Gets the items.
	 *
	 * @return the items
	 */
	public int getItems() {
		return items;
	}

	/**
	 * Sets the items.
	 *
	 * @param items
	 *            the new items
	 */
	public void setItems(int items) {
		this.items = items;
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
