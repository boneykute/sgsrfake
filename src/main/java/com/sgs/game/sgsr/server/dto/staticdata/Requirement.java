package com.sgs.game.sgsr.server.dto.staticdata;

public class Requirement {

	enum RequirementType {
		/** The Kills */
		TotalKillsCount("TotalKillsCount"),
		/** The login count */
		TotalLoginCount("TotalLoginCount"),
		/** The trophies count */
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

	private int items;
	private RequirementType type;

	public Requirement(int items, RequirementType type) {
		this.setItems(items);
		this.setType(type);
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public RequirementType getType() {
		return type;
	}

	public void setType(RequirementType type) {
		this.type = type;
	}
}
