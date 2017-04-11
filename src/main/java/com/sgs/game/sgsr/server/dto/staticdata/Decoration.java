/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class Decoration.
 */
public class Decoration extends BaseStaticDataDTO<Decoration> {

	/** The price. */
	private int price;

	/** The resource type. */
	private String resourceType;

	/** The quantity. */
	private int quantity;

	/** The order. */
	private int order;

	/**
	 * Instantiates a new decoration.
	 */
	public Decoration() {
		super();
	}

	/**
	 * Instantiates a new decoration.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param price
	 *            the price
	 * @param resourceType
	 *            the resource type
	 * @param quantity
	 *            the quantity
	 * @param order
	 *            the order
	 */
	public Decoration(int id, String name, String description, int price, String resourceType, int quantity,
			int order) {
		super(id, name, description);
		this.price = price;
		this.resourceType = resourceType;
		this.quantity = quantity;
		this.order = order;
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
	public String getResourceType() {
		return resourceType;
	}

	/**
	 * Sets the resource type.
	 *
	 * @param resourceType
	 *            the new resource type
	 */
	public void setResourceType(String resourceType) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected Decoration clone() {
		return new Decoration(id, name, description, price, resourceType, quantity, order);
	}

}
