/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseStaticDataDTO.
 *
 * @param <T>
 *            the generic type
 */
public class BaseStaticDataDTO<T extends BaseStaticDataDTO<T>> implements IBaseStaticDataDTO<T> {

	/** The id. */
	protected int id;

	/** The name. */
	protected String name;

	/** The description. */
	protected String description;

	/**
	 * Instantiates a new base static data DTO.
	 */
	public BaseStaticDataDTO() {
	}

	/**
	 * Instantiates a new base static data DTO.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 */
	public BaseStaticDataDTO(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T clone() {
		return ((T) new BaseStaticDataDTO<T>(id, name, description));
	}
}
