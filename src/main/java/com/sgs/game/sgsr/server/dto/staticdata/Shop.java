package com.sgs.game.sgsr.server.dto.staticdata;

public class Shop extends BaseStaticDataDTO<Shop> {
	private String type;
	private int itemId;
	private int price;
	private String resourceType;
	private int quantity;
	private int order;
	private String category;
	private String tab;
	private int cooldownTime;

	public Shop() {
		super();
	}

	public Shop(int id, String name, String description, String type, int itemId, int price, String resourceType,
			int quantity, int order, String category, String tab, int cooldownTime) {
		super(id, name, description);
		this.type = type;
		this.itemId = itemId;
		this.price = price;
		this.resourceType = resourceType;
		this.quantity = quantity;
		this.order = order;
		this.category = category;
		this.tab = tab;
		this.cooldownTime = cooldownTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
	}

	public int getCooldownTime() {
		return cooldownTime;
	}

	public void setCooldownTime(int cooldownTime) {
		this.cooldownTime = cooldownTime;
	}

	@Override
	protected Shop clone() {
		return new Shop(id, category, category, type, itemId, price, resourceType, quantity, order, category, tab,
				cooldownTime);
	}
}
