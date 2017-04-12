/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.subitem.DungeonItem;

// TODO: Auto-generated Javadoc
/**
 * The Class Dungeon.
 */
public class Dungeon extends BaseStaticDataDTO<Dungeon> {

	/** The total level. */
	private int totalLevel;

	/** The required level. */
	private int requiredLevel;

	/** The food consume. */
	private int foodConsume;

	/** The item count. */
	private int itemCount;

	/** The items. */
	private List<DungeonItem> items;

	/**
	 * Instantiates a new dungeon.
	 */
	public Dungeon() {
		super();
	}

	/**
	 * Instantiates a new dungeon.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param totalLevel
	 *            the total level
	 * @param requiredLevel
	 *            the required level
	 * @param foodConsume
	 *            the food consume
	 * @param itemCount
	 *            the item count
	 * @param items
	 *            the items
	 */
	public Dungeon(int id, String name, String description, int totalLevel, int requiredLevel, int foodConsume,
			int itemCount, List<DungeonItem> items) {
		super(id, name, description);
		this.totalLevel = totalLevel;
		this.requiredLevel = requiredLevel;
		this.foodConsume = foodConsume;
		this.itemCount = itemCount;
		this.items = items;
	}

	/**
	 * Gets the total level.
	 *
	 * @return the total level
	 */
	public int getTotalLevel() {
		return totalLevel;
	}

	/**
	 * Sets the total level.
	 *
	 * @param totalLevel
	 *            the new total level
	 */
	public void setTotalLevel(int totalLevel) {
		this.totalLevel = totalLevel;
	}

	/**
	 * Gets the required level.
	 *
	 * @return the required level
	 */
	public int getRequiredLevel() {
		return requiredLevel;
	}

	/**
	 * Sets the required level.
	 *
	 * @param requiredLevel
	 *            the new required level
	 */
	public void setRequiredLevel(int requiredLevel) {
		this.requiredLevel = requiredLevel;
	}

	/**
	 * Gets the food consume.
	 *
	 * @return the food consume
	 */
	public int getFoodConsume() {
		return foodConsume;
	}

	/**
	 * Sets the food consume.
	 *
	 * @param foodConsume
	 *            the new food consume
	 */
	public void setFoodConsume(int foodConsume) {
		this.foodConsume = foodConsume;
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
	public List<DungeonItem> getItems() {
		return items;
	}

	/**
	 * Sets the items.
	 *
	 * @param items
	 *            the new items
	 */
	public void setItems(List<DungeonItem> items) {
		this.items = items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	public Dungeon clone() {
		return new Dungeon(id, name, description, totalLevel, requiredLevel, foodConsume, itemCount, items);
	}

}
