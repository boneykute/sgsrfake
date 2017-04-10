/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

// TODO: Auto-generated Javadoc
/**
 * The Class Element.
 */
public class Element extends BaseStaticDataDTO<Element> {

	/**
	 * Instantiates a new element.
	 */
	public Element() {
		super();
	}

	/**
	 * Instantiates a new element.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 */
	public Element(int id, String name, String description) {
		super(id, name, description);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected Element clone() {
		return new Element(id, name, description);
	}

}
