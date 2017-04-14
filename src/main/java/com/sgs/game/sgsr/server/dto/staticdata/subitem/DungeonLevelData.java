/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class DungeonLevelData.
 */
public class DungeonLevelData {

	/** The id. */
	private int id;

	/** The required level. */
	private int requiredLevel;

	/** The food consume. */
	private int foodConsume;

	/** The item count. */
	private int itemCount;

	/** The items. */
	private List<DungeonItem> items;

	/**
	 * Instantiates a new dungeon level data.
	 *
	 * @param id
	 *            the id
	 * @param requiredLevel
	 *            the required level
	 * @param foodConsume
	 *            the food consume
	 * @param itemCount
	 *            the item count
	 * @param items
	 *            the items
	 */
	public DungeonLevelData(int id, int requiredLevel, int foodConsume, int itemCount, List<DungeonItem> items) {
		this.id = id;
		this.requiredLevel = requiredLevel;
		this.foodConsume = foodConsume;
		this.itemCount = itemCount;
		this.items = items;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
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

}
