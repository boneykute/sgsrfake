package com.sgs.game.sgsr.server.dto.staticdata;

public abstract class BaseStaticDataDTO<T> implements IBaseStaticDataDTO<T> {
	protected int id;
	protected String name;
	protected String description;

	public BaseStaticDataDTO() {
	}

	public BaseStaticDataDTO(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	protected abstract T clone();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
