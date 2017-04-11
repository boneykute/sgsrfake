/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

// TODO: Auto-generated Javadoc
/**
 * The Class BuildingLevelData.
 */
public class BuildingLevelData {

	/** The id. */
	private int id;

	/** The hp. */
	private int HP;

	/** The cost. */
	private int cost;

	/** The damage. */
	private int damage;

	/** The attack speed. */
	private int attackSpeed;

	/** The range. */
	private int range;

	/** The size. */
	private int size;

	/**
	 * Instantiates a new building level data.
	 */
	public BuildingLevelData() {
	}

	/**
	 * Instantiates a new building level data.
	 *
	 * @param id
	 *            the id
	 * @param HP
	 *            the hp
	 * @param cost
	 *            the cost
	 * @param damage
	 *            the damage
	 * @param attackSpeed
	 *            the attack speed
	 * @param range
	 *            the range
	 * @param size
	 *            the size
	 */
	public BuildingLevelData(int id, int HP, int cost, int damage, int attackSpeed, int range, int size) {
		this.id = id;
		this.HP = HP;
		this.cost = cost;
		this.damage = damage;
		this.attackSpeed = attackSpeed;
		this.range = range;
		this.size = size;
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
	 * Gets the hp.
	 *
	 * @return the hp
	 */
	public int getHP() {
		return HP;
	}

	/**
	 * Sets the hp.
	 *
	 * @param HP
	 *            the new hp
	 */
	public void setHP(int HP) {
		this.HP = HP;
	}

	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * Sets the cost.
	 *
	 * @param cost
	 *            the new cost
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * Gets the damage.
	 *
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * Sets the damage.
	 *
	 * @param damage
	 *            the new damage
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}

	/**
	 * Gets the attack speed.
	 *
	 * @return the attack speed
	 */
	public int getAttackSpeed() {
		return attackSpeed;
	}

	/**
	 * Sets the attack speed.
	 *
	 * @param attackSpeed
	 *            the new attack speed
	 */
	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	/**
	 * Gets the range.
	 *
	 * @return the range
	 */
	public int getRange() {
		return range;
	}

	/**
	 * Sets the range.
	 *
	 * @param range
	 *            the new range
	 */
	public void setRange(int range) {
		this.range = range;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size
	 *            the new size
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
