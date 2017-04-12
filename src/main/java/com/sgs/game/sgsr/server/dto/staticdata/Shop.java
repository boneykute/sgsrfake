/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import com.sgs.game.sgsr.server.dto.enumitem.ResourceType;

// TODO: Auto-generated Javadoc
/**
 * The Class Shop.
 */
public class Shop extends BaseStaticDataDTO<Shop> {

	/** The type. */
	private String type;

	/** The item id. */
	private int itemId;

	/** The price. */
	private int price;

	/** The resource type. */
	private ResourceType resourceType;

	/** The quantity. */
	private int quantity;

	/** The order. */
	private int order;

	/** The category. */
	private String category;

	/** The tab. */
	private String tab;

	/** The cooldown time. */
	private int cooldownTime;

	/**
	 * Instantiates a new shop.
	 */
	public Shop() {
		super();
	}

	/**
	 * Instantiates a new shop.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param type
	 *            the type
	 * @param itemId
	 *            the item id
	 * @param price
	 *            the price
	 * @param resourceType
	 *            the resource type
	 * @param quantity
	 *            the quantity
	 * @param order
	 *            the order
	 * @param category
	 *            the category
	 * @param tab
	 *            the tab
	 * @param cooldownTime
	 *            the cooldown time
	 */
	public Shop(int id, String name, String description, String type, int itemId, int price, ResourceType resourceType,
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

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type
	 *            the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the item id.
	 *
	 * @return the item id
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * Sets the item id.
	 *
	 * @param itemId
	 *            the new item id
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price
	 *            the new price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Gets the resource type.
	 *
	 * @return the resource type
	 */
	public ResourceType getResourceType() {
		return resourceType;
	}

	/**
	 * Sets the resource type.
	 *
	 * @param resourceType
	 *            the new resource type
	 */
	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity
	 *            the new quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the order.
	 *
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * Sets the order.
	 *
	 * @param order
	 *            the new order
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category
	 *            the new category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Gets the tab.
	 *
	 * @return the tab
	 */
	public String getTab() {
		return tab;
	}

	/**
	 * Sets the tab.
	 *
	 * @param tab
	 *            the new tab
	 */
	public void setTab(String tab) {
		this.tab = tab;
	}

	/**
	 * Gets the cooldown time.
	 *
	 * @return the cooldown time
	 */
	public int getCooldownTime() {
		return cooldownTime;
	}

	/**
	 * Sets the cooldown time.
	 *
	 * @param cooldownTime
	 *            the new cooldown time
	 */
	public void setCooldownTime(int cooldownTime) {
		this.cooldownTime = cooldownTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected Shop clone() {
		return new Shop(id, category, category, type, itemId, price, resourceType, quantity, order, category, tab,
				cooldownTime);
	}
}
