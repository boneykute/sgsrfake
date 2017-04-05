package com.sgs.game.sgsr.server.utils.db;

public enum DataFileType {
	Character("Character"), Building("Building"), Rune("Rune"), Chest("Chest"), Pack("Pack");

	private final String name;

	private DataFileType(String str) {
		name = str;
	}

	public boolean equalsName(final String otherName) {
		return name.equals(otherName);
	}

	public String toString() {
		return this.name;
	}
}
