/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Pack.
 */
public class Pack extends BaseStaticDataDTO<Pack> {

	/** The item count. */
	private int itemCount;

	/** The items. */
	private List<SubItem> items;

	/**
	 * Instantiates a new pack.
	 */
	public Pack() {
		super();
	}

	/**
	 * Instantiates a new pack.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param desciption
	 *            the desciption
	 * @param items
	 *            the items
	 */
	public Pack(int id, String name, String desciption, List<SubItem> items) {
		super(id, name, desciption);
		this.items = items;
	}

	/**
	 * Gets the item count.
	 *
	 * @return the item count
	 */
	public int getItemCount() {
		return itemCount;
	}

	/**
	 * Sets the item count.
	 *
	 * @param itemCount
	 *            the new item count
	 */
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	/**
	 * Gets the items.
	 *
	 * @return the items
	 */
	public List<SubItem> getItems() {
		return items;
	}

	/**
	 * Sets the items.
	 *
	 * @param items
	 *            the new items
	 */
	public void setItems(List<SubItem> items) {
		this.items = items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected Pack clone() {
		return new Pack(id, name, description, items);
	}
}
