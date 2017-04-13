/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class GlobalConfig.
 */
public class GlobalConfig extends BaseStaticDataDTO<GlobalConfig> {

	/** The value. */
	private float value;

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
	 * @param value
	 *            the value
	 */
	public GlobalConfig(int id, String name, String description, float value) {
		super(id, name, description);
		this.value = value;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public float getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value
	 *            the new value
	 */
	public void setValue(float value) {
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	public GlobalConfig clone() {
		return new GlobalConfig(id, name, description, value);
	}
}
