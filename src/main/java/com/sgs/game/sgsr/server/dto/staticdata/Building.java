/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.enumitem.ResourceType;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.BuildingLevelData;

// TODO: Auto-generated Javadoc
/**
 * The Class Building.
 */
public class Building extends BaseStaticDataDTO<Building> {

	/** The total level. */
	private int totalLevel;

	/** The is resource generator. */
	// Resource generator field
	private boolean isResourceGenerator;

	/** The resource type id. */
	private ResourceType resourceType;

	/** The generate speed. */
	private float generateSpeed;

	/** The maximum resource. */
	private int maximumResource;;

	/** The is attackable. */
	// Attackable field
	private boolean isAttackable;

	/** The is on path. */
	private int isOnPath;

	/** The levels. */
	// Level list
	private List<BuildingLevelData> levels;

	/**
	 * Instantiates a new building.
	 */
	public Building() {
		super();
	}

	/**
	 * Instantiates a new building.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param totalLevel
	 *            the total level
	 * @param isResourceGenerator
	 *            the is resource generator
	 * @param resourceType
	 *            the resource type
	 * @param generateSpeed
	 *            the generate speed
	 * @param maximumResource
	 *            the maximum resource
	 * @param isAttackable
	 *            the is attackable
	 * @param isOnPath
	 *            the is on path
	 * @param levels
	 *            the levels
	 */
	public Building(int id, String name, String description, int totalLevel, boolean isResourceGenerator,
			ResourceType resourceType, float generateSpeed, int maximumResource, boolean isAttackable, int isOnPath,
			List<BuildingLevelData> levels) {
		super(id, name, description);
		this.totalLevel = totalLevel;
		this.isResourceGenerator = isResourceGenerator;
		this.resourceType = resourceType;
		this.generateSpeed = generateSpeed;
		this.maximumResource = maximumResource;
		this.isAttackable = isAttackable;
		this.isOnPath = isOnPath;
		this.levels = levels;
	}

	/**
	 * Gets the total level.
	 *
	 * @return the total level
	 */
	public int getTotalLevel() {
		return totalLevel;
	}

	/**
	 * Sets the total level.
	 *
	 * @param totalLevel
	 *            the new total level
	 */
	public void setTotalLevel(int totalLevel) {
		this.totalLevel = totalLevel;
	}

	/**
	 * Checks if is resource generator.
	 *
	 * @return true, if is resource generator
	 */
	public boolean isResourceGenerator() {
		return isResourceGenerator;
	}

	/**
	 * Sets the resource generator.
	 *
	 * @param isResourceGenerator
	 *            the new resource generator
	 */
	public void setResourceGenerator(boolean isResourceGenerator) {
		this.isResourceGenerator = isResourceGenerator;
	}

	/**
	 * Gets the resource type id.
	 *
	 * @return the resource type id
	 */
	public ResourceType getResourceType() {
		return resourceType;
	}

	/**
	 * Sets the resource type id.
	 *
	 * @param resourceType
	 *            the new resource type id
	 */
	public void setResourceTypeId(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * Gets the generate speed.
	 *
	 * @return the generate speed
	 */
	public float getGenerateSpeed() {
		return generateSpeed;
	}

	/**
	 * Sets the generate speed.
	 *
	 * @param generateSpeed
	 *            the new generate speed
	 */
	public void setGenerateSpeed(float generateSpeed) {
		this.generateSpeed = generateSpeed;
	}

	/**
	 * Gets the maximum resource.
	 *
	 * @return the maximum resource
	 */
	public int getMaximumResource() {
		return maximumResource;
	}

	/**
	 * Sets the maximum resource.
	 *
	 * @param maximumResource
	 *            the new maximum resource
	 */
	public void setMaximumResource(int maximumResource) {
		this.maximumResource = maximumResource;
	}

	/**
	 * Checks if is attackable.
	 *
	 * @return true, if is attackable
	 */
	public boolean isAttackable() {
		return isAttackable;
	}

	/**
	 * Sets the attackable.
	 *
	 * @param isAttackable
	 *            the new attackable
	 */
	public void setAttackable(boolean isAttackable) {
		this.isAttackable = isAttackable;
	}

	/**
	 * Gets the checks if is on path.
	 *
	 * @return the checks if is on path
	 */
	public int getIsOnPath() {
		return isOnPath;
	}

	/**
	 * Sets the checks if is on path.
	 *
	 * @param isOnPath
	 *            the new checks if is on path
	 */
	public void setIsOnPath(int isOnPath) {
		this.isOnPath = isOnPath;
	}

	/**
	 * Gets the levels.
	 *
	 * @return the levels
	 */
	public List<BuildingLevelData> getLevels() {
		return levels;
	}

	/**
	 * Sets the levels.
	 *
	 * @param levels
	 *            the new levels
	 */
	public void setLevels(List<BuildingLevelData> levels) {
		this.levels = levels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected Building clone() {
		return new Building(id, name, description, totalLevel, isResourceGenerator, resourceType, generateSpeed,
				maximumResource, isAttackable, isOnPath, levels);
	}

}
