package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

public class Avatar extends BaseStaticDataDTO<Avatar> {

	private int requirementCount;
	private List<Requirement> requirements;

	public Avatar() {
		super();
	}

	public Avatar(int id, String name, String description, int requirementCount, List<Requirement> requirements) {
		super(id, name, description);
		this.requirementCount = requirementCount;
		this.requirements = requirements;
	}

	public int getRequirementCount() {
		return requirementCount;
	}

	public void setRequirementCount(int requirementCount) {
		this.requirementCount = requirementCount;
	}

	public List<Requirement> getRequirements() {
		return requirements;
	}

	public void setRequirements(List<Requirement> requirements) {
		this.requirements = requirements;
	}

	@Override
	protected Avatar clone() {
		return new Avatar(id, name, description, requirementCount, requirements);
	}
}
