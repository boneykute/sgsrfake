/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.subitem.BoostStats;

// TODO: Auto-generated Javadoc
/**
 * The Class Booster.
 */
public class Booster extends BaseStaticDataDTO<Booster> {

	/** The stats count. */
	private int statsCount;

	/** The boost stats. */
	private List<BoostStats> boostStats;

	/**
	 * Instantiates a new booster.
	 */
	public Booster() {
		super();
	}

	/**
	 * Instantiates a new booster.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param statsCount
	 *            the stats count
	 * @param boostStats
	 *            the boost stats
	 */
	public Booster(int id, String name, String description, int statsCount, List<BoostStats> boostStats) {
		super(id, name, description);
		this.statsCount = statsCount;
		this.boostStats = boostStats;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected Booster clone() {
		return new Booster(id, name, description, statsCount, boostStats);
	}
}
