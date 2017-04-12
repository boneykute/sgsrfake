/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Season.
 */
public class Season extends BaseStaticDataDTO<Season> {

	/** The start date. */
	private Date startDate;

	/** The end date. */
	private Date endDate;

	/** The duration. */
	private long duration;

	/** The is repeat. */
	private boolean isRepeat;

	/**
	 * Instantiates a new season.
	 */
	public Season() {
		super();
	}

	/**
	 * Instantiates a new season.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param startDate
	 *            the start date
	 * @param endDate
	 *            the end date
	 * @param duration
	 *            the duration
	 * @param isRepeat
	 *            the is repeat
	 */
	public Season(int id, String name, String description, Date startDate, Date endDate, long duration,
			boolean isRepeat) {
		super(id, name, description);
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.isRepeat = isRepeat;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate
	 *            the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate
	 *            the new end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration
	 *            the new duration
	 */
	public void setDuration(long duration) {
		this.duration = duration;
	}

	/**
	 * Checks if is repeat.
	 *
	 * @return true, if is repeat
	 */
	public boolean isRepeat() {
		return isRepeat;
	}

	/**
	 * Sets the repeat.
	 *
	 * @param isRepeat
	 *            the new repeat
	 */
	public void setRepeat(boolean isRepeat) {
		this.isRepeat = isRepeat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	public Season clone() {
		return new Season(id, name, description, startDate, endDate, duration, isRepeat);
	}

}
