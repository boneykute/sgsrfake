/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class ResourceType.
 */
public class ResourceType extends BaseStaticDataDTO<ResourceType> {

	/**
	 * Instantiates a new resource type.
	 */
	public ResourceType() {
		super();
	}

	/**
	 * Instantiates a new resource type.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 */
	public ResourceType(int id, String name, String description) {
		super(id, name, description);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected ResourceType clone() {
		return new ResourceType(id, name, description);
	}

}
