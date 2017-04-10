package com.sgs.game.sgsr.server.dto.staticdata;

public class SubItem {
	private int id;
	private String name;
	private int amount;

	public SubItem() {
	}

	public SubItem(int id, String name, int amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}