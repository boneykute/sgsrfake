/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.subitem.ChestItem;

// TODO: Auto-generated Javadoc
/**
 * The Class Chest.
 */
public class Chest extends BaseStaticDataDTO<Chest> {

	/** The chest type. */
	private String chestType;

	/** The league id. */
	private int leagueId;

	/** The item count. */
	private int itemCount;

	/** The unlock time. */
	private int unlockTime;

	/** The items. */
	private List<ChestItem> items;

	/**
	 * Instantiates a new chest.
	 */
	public Chest() {
		super();
	}

	/**
	 * Instantiates a new chest.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param chestType
	 *            the chest type
	 * @param leagueId
	 *            the league id
	 * @param itemCount
	 *            the item count
	 * @param unlockTime
	 *            the unlock time
	 * @param items
	 *            the items
	 */
	public Chest(int id, String name, String description, String chestType, int leagueId, int itemCount, int unlockTime,
			List<ChestItem> items) {
		super(id, name, description);
		this.chestType = chestType;
		this.leagueId = leagueId;
		this.itemCount = itemCount;
		this.unlockTime = unlockTime;
		this.items = items;
	}

	/**
	 * Gets the chest type.
	 *
	 * @return the chest type
	 */
	public String getChestType() {
		return chestType;
	}

	/**
	 * Sets the chest type.
	 *
	 * @param chestType
	 *            the new chest type
	 */
	public void setChestType(String chestType) {
		this.chestType = chestType;
	}

	/**
	 * Gets the league id.
	 *
	 * @return the league id
	 */
	public int getLeagueId() {
		return leagueId;
	}

	/**
	 * Sets the league id.
	 *
	 * @param leagueId
	 *            the new league id
	 */
	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
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
	 * Gets the unlock time.
	 *
	 * @return the unlock time
	 */
	public int getUnlockTime() {
		return unlockTime;
	}

	/**
	 * Sets the unlock time.
	 *
	 * @param unlockTime
	 *            the new unlock time
	 */
	public void setUnlockTime(int unlockTime) {
		this.unlockTime = unlockTime;
	}

	/**
	 * Gets the items.
	 *
	 * @return the items
	 */
	public List<ChestItem> getItems() {
		return items;
	}

	/**
	 * Sets the items.
	 *
	 * @param items
	 *            the new items
	 */
	public void setItems(List<ChestItem> items) {
		this.items = items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected Chest clone() {
		return new Chest(id, name, description, chestType, leagueId, itemCount, unlockTime, items);
	}

}
