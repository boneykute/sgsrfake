/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class GlobalConfig.
 */
public class GlobalConfig extends BaseStaticDataDTO<GlobalConfig> {

	/**
	 * Instantiates a new global config.
	 */
	public GlobalConfig() {
		super();
	}

	/**
	 * Instantiates a new global config.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 */
	public GlobalConfig(int id, String name, String description) {
		super(id, name, description);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	public GlobalConfig clone() {
		return new GlobalConfig(id, name, description);
	}
}
