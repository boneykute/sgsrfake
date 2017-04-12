/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class DailyLoginReward.
 */
public class DailyLoginReward extends BaseStaticDataDTO<DailyLoginReward> {

	/** The pack id. */
	private int packId;

	/** The month. */
	private int month;

	/**
	 * Instantiates a new daily login reward.
	 */
	public DailyLoginReward() {
		super();
	}

	/**
	 * Instantiates a new daily login reward.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param month
	 *            the month
	 * @param packId
	 *            the pack id
	 */
	public DailyLoginReward(int id, String name, String description, int month, int packId) {
		super(id, name, description);
		this.month = month;
		this.packId = packId;
	}

	/**
	 * Gets the pack id.
	 *
	 * @return the pack id
	 */
	public int getPackId() {
		return packId;
	}

	/**
	 * Sets the pack id.
	 *
	 * @param packId
	 *            the new pack id
	 */
	public void setPackId(int packId) {
		this.packId = packId;
	}

	/**
	 * Gets the month.
	 *
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Sets the month.
	 *
	 * @param month
	 *            the new month
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	public DailyLoginReward clone() {
		return new DailyLoginReward(id, name, description, month, packId);
	}
}
