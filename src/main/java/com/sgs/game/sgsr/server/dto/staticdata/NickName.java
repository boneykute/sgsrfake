/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class NickName.
 */
public class NickName extends BaseStaticDataDTO<NickName> {

	/** The requirement count. */
	private int requirementCount;

	/** The requirements. */
	private List<Requirement> requirements;

	/**
	 * Instantiates a new nick name.
	 */
	public NickName() {
		super();
	}

	/**
	 * Instantiates a new nick name.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param requirementCount
	 *            the requirement count
	 * @param requirements
	 *            the requirements
	 */
	public NickName(int id, String name, String description, int requirementCount, List<Requirement> requirements) {
		super(id, name, description);
		this.requirementCount = requirementCount;
		this.requirements = requirements;
	}

	/**
	 * Gets the requirement count.
	 *
	 * @return the requirement count
	 */
	public int getRequirementCount() {
		return requirementCount;
	}

	/**
	 * Sets the requirement count.
	 *
	 * @param requirementCount
	 *            the new requirement count
	 */
	public void setRequirementCount(int requirementCount) {
		this.requirementCount = requirementCount;
	}

	/**
	 * Gets the requirements.
	 *
	 * @return the requirements
	 */
	public List<Requirement> getRequirements() {
		return requirements;
	}

	/**
	 * Sets the requirements.
	 *
	 * @param requirements
	 *            the new requirements
	 */
	public void setRequirements(List<Requirement> requirements) {
		this.requirements = requirements;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected NickName clone() {
		// TODO Auto-generated method stub
		return null;
	}
}
