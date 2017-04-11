/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

// TODO: Auto-generated Javadoc
/**
 * The Class CharacterStatLevelData.
 */
public class CharacterStatLevelData {

	/** The id. */
	private int id;

	/** The stars. */
	private int stars;

	/** The required skill points. */
	private int requiredSkillPoints;

	/** The aggro range. */
	private float aggroRange;

	/** The attack range. */
	private float attackRange;

	/** The move speed. */
	private float moveSpeed;

	/** The attack speed. */
	private float attackSpeed;

	/** The critical rate. */
	private float criticalRate;

	/** The critical damage. */
	private float criticalDamage;

	/** The resistance. */
	private float resistance;

	/** The regen. */
	private float regen;

	/** The dodge. */
	private float dodge;

	/** The block damage flat. */
	private float blockDamageFlat;

	/** The block damage percent. */
	private float blockDamagePercent;

	/** The life per hit flat. */
	private float lifePerHitFlat;

	/** The life per hit percent. */
	private float lifePerHitPercent;

	/**
	 * Instantiates a new character stat level data.
	 */
	public CharacterStatLevelData() {
		super();
	}

	/**
	 * Instantiates a new character stat level data.
	 *
	 * @param id
	 *            the id
	 * @param stars
	 *            the stars
	 * @param requiredSkillPoints
	 *            the required skill points
	 * @param aggroRange
	 *            the aggro range
	 * @param attackRange
	 *            the attack range
	 * @param moveSpeed
	 *            the move speed
	 * @param attackSpeed
	 *            the attack speed
	 * @param criticalRate
	 *            the critical rate
	 * @param criticalDamage
	 *            the critical damage
	 * @param resistance
	 *            the resistance
	 * @param regen
	 *            the regen
	 * @param dodge
	 *            the dodge
	 * @param blockDamageFlat
	 *            the block damage flat
	 * @param blockDamagePercent
	 *            the block damage percent
	 * @param lifePerHitFlat
	 *            the life per hit flat
	 * @param lifePerHitPercent
	 *            the life per hit percent
	 */
	public CharacterStatLevelData(int id, int stars, int requiredSkillPoints, float aggroRange, float attackRange,
			float moveSpeed, float attackSpeed, float criticalRate, float criticalDamage, float resistance, float regen,
			float dodge, float blockDamageFlat, float blockDamagePercent, float lifePerHitFlat,
			float lifePerHitPercent) {
		this.id = id;
		this.stars = stars;
		this.requiredSkillPoints = requiredSkillPoints;
		this.aggroRange = aggroRange;
		this.attackRange = attackRange;
		this.moveSpeed = moveSpeed;
		this.attackSpeed = attackSpeed;
		this.criticalRate = criticalRate;
		this.criticalDamage = criticalDamage;
		this.resistance = resistance;
		this.regen = regen;
		this.dodge = dodge;
		this.blockDamageFlat = blockDamageFlat;
		this.blockDamagePercent = blockDamagePercent;
		this.lifePerHitFlat = lifePerHitFlat;
		this.lifePerHitPercent = lifePerHitPercent;
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
	 * Gets the stars.
	 *
	 * @return the stars
	 */
	public int getStars() {
		return stars;
	}

	/**
	 * Sets the stars.
	 *
	 * @param stars
	 *            the new stars
	 */
	public void setStars(int stars) {
		this.stars = stars;
	}

	/**
	 * Gets the required skill points.
	 *
	 * @return the required skill points
	 */
	public int getRequiredSkillPoints() {
		return requiredSkillPoints;
	}

	/**
	 * Sets the required skill points.
	 *
	 * @param requiredSkillPoints
	 *            the new required skill points
	 */
	public void setRequiredSkillPoints(int requiredSkillPoints) {
		this.requiredSkillPoints = requiredSkillPoints;
	}

	/**
	 * Gets the aggro range.
	 *
	 * @return the aggro range
	 */
	public float getAggroRange() {
		return aggroRange;
	}

	/**
	 * Sets the aggro range.
	 *
	 * @param aggroRange
	 *            the new aggro range
	 */
	public void setAggroRange(float aggroRange) {
		this.aggroRange = aggroRange;
	}

	/**
	 * Gets the attack range.
	 *
	 * @return the attack range
	 */
	public float getAttackRange() {
		return attackRange;
	}

	/**
	 * Sets the attack range.
	 *
	 * @param attackRange
	 *            the new attack range
	 */
	public void setAttackRange(float attackRange) {
		this.attackRange = attackRange;
	}

	/**
	 * Gets the move speed.
	 *
	 * @return the move speed
	 */
	public float getMoveSpeed() {
		return moveSpeed;
	}

	/**
	 * Sets the move speed.
	 *
	 * @param moveSpeed
	 *            the new move speed
	 */
	public void setMoveSpeed(float moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	/**
	 * Gets the attack speed.
	 *
	 * @return the attack speed
	 */
	public float getAttackSpeed() {
		return attackSpeed;
	}

	/**
	 * Sets the attack speed.
	 *
	 * @param attackSpeed
	 *            the new attack speed
	 */
	public void setAttackSpeed(float attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	/**
	 * Gets the critical rate.
	 *
	 * @return the critical rate
	 */
	public float getCriticalRate() {
		return criticalRate;
	}

	/**
	 * Sets the critical rate.
	 *
	 * @param criticalRate
	 *            the new critical rate
	 */
	public void setCriticalRate(float criticalRate) {
		this.criticalRate = criticalRate;
	}

	/**
	 * Gets the critical damage.
	 *
	 * @return the critical damage
	 */
	public float getCriticalDamage() {
		return criticalDamage;
	}

	/**
	 * Sets the critical damage.
	 *
	 * @param criticalDamage
	 *            the new critical damage
	 */
	public void setCriticalDamage(float criticalDamage) {
		this.criticalDamage = criticalDamage;
	}

	/**
	 * Gets the resistance.
	 *
	 * @return the resistance
	 */
	public float getResistance() {
		return resistance;
	}

	/**
	 * Sets the resistance.
	 *
	 * @param resistance
	 *            the new resistance
	 */
	public void setResistance(float resistance) {
		this.resistance = resistance;
	}

	/**
	 * Gets the regen.
	 *
	 * @return the regen
	 */
	public float getRegen() {
		return regen;
	}

	/**
	 * Sets the regen.
	 *
	 * @param regen
	 *            the new regen
	 */
	public void setRegen(float regen) {
		this.regen = regen;
	}

	/**
	 * Gets the dodge.
	 *
	 * @return the dodge
	 */
	public float getDodge() {
		return dodge;
	}

	/**
	 * Sets the dodge.
	 *
	 * @param dodge
	 *            the new dodge
	 */
	public void setDodge(float dodge) {
		this.dodge = dodge;
	}

	/**
	 * Gets the block damage flat.
	 *
	 * @return the block damage flat
	 */
	public float getBlockDamageFlat() {
		return blockDamageFlat;
	}

	/**
	 * Sets the block damage flat.
	 *
	 * @param blockDamageFlat
	 *            the new block damage flat
	 */
	public void setBlockDamageFlat(float blockDamageFlat) {
		this.blockDamageFlat = blockDamageFlat;
	}

	/**
	 * Gets the block damage percent.
	 *
	 * @return the block damage percent
	 */
	public float getBlockDamagePercent() {
		return blockDamagePercent;
	}

	/**
	 * Sets the block damage percent.
	 *
	 * @param blockDamagePercent
	 *            the new block damage percent
	 */
	public void setBlockDamagePercent(float blockDamagePercent) {
		this.blockDamagePercent = blockDamagePercent;
	}

	/**
	 * Gets the life per hit flat.
	 *
	 * @return the life per hit flat
	 */
	public float getLifePerHitFlat() {
		return lifePerHitFlat;
	}

	/**
	 * Sets the life per hit flat.
	 *
	 * @param lifePerHitFlat
	 *            the new life per hit flat
	 */
	public void setLifePerHitFlat(float lifePerHitFlat) {
		this.lifePerHitFlat = lifePerHitFlat;
	}

	/**
	 * Gets the life per hit percent.
	 *
	 * @return the life per hit percent
	 */
	public float getLifePerHitPercent() {
		return lifePerHitPercent;
	}

	/**
	 * Sets the life per hit percent.
	 *
	 * @param lifePerHitPercent
	 *            the new life per hit percent
	 */
	public void setLifePerHitPercent(float lifePerHitPercent) {
		this.lifePerHitPercent = lifePerHitPercent;
	}

}
