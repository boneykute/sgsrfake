package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

public class Pack extends BaseStaticDataDTO<Pack> {

	private int itemCount;
	private List<SubItem> items;

	public Pack() {
		super();
	}

	public Pack(int id, String name, String desciption, List<SubItem> items) {
		super(id, name, desciption);
		this.items = items;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public List<SubItem> getItems() {
		return items;
	}

	public void setItems(List<SubItem> items) {
		this.items = items;
	}

	@Override
	protected Pack clone() {
		return new Pack(id, name, description, items);
	}
}
