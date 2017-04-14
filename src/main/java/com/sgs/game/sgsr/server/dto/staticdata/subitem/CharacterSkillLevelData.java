/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

import java.util.List;

import com.sgs.game.sgsr.server.dto.enumitem.TargetType;

// TODO: Auto-generated Javadoc
/**
 * The Class CharacterSkillLevelData.
 */
public class CharacterSkillLevelData {

	/** The id. */
	private int id;

	/** The level up cost. */
	private int levelUpCost;

	/** The duration. */
	private float duration;

	/** The cast time. */
	private float castTime;

	/** The cooldown. */
	private float cooldown;

	/** The target. */
	private TargetType target;

	/** The target range. */
	private float targetRange;

	/** The radius. */
	private float radius;

	/** The angle. */
	private int angle;

	/** The ATK multiplier. */
	private float ATKMultiplier;

	/** The projectile count. */
	private int projectileCount;

	/** The project speed. */
	private float projectSpeed;

	/** The shotgun. */
	private boolean isShotgun;

	/** The status change. */
	private float statusChance;

	/** The total effect. */
	private int totalEffect;

	/** The effects. */
	private List<SkillEffect> effects;

	/**
	 * Instantiates a new character skill level data.
	 */
	public CharacterSkillLevelData() {
		super();
	}

	/**
	 * Instantiates a new character skill level data.
	 *
	 * @param id
	 *            the id
	 * @param levelUpCost
	 *            the level up cost
	 * @param duration
	 *            the duration
	 * @param castTime
	 *            the cast time
	 * @param cooldown
	 *            the cooldown
	 * @param target
	 *            the target
	 * @param targetRange
	 *            the target range
	 * @param radius
	 *            the radius
	 * @param angle
	 *            the angle
	 * @param ATKMultiplier
	 *            the ATK multiplier
	 * @param projectileCount
	 *            the projectile count
	 * @param projectSpeed
	 *            the project speed
	 * @param shotgun
	 *            the shotgun
	 * @param statusChange
	 *            the status change
	 * @param totalEffect
	 *            the total effect
	 * @param effects
	 *            the effects
	 */
	public CharacterSkillLevelData(int id, int levelUpCost, float duration, float castTime, float cooldown,
			TargetType target, float targetRange, float radius, int angle, float ATKMultiplier, int projectileCount,
			float projectSpeed, boolean shotgun, float statusChange, int totalEffect, List<SkillEffect> effects) {
		this.id = id;
		this.levelUpCost = levelUpCost;
		this.duration = duration;
		this.castTime = castTime;
		this.cooldown = cooldown;
		this.target = target;
		this.targetRange = targetRange;
		this.radius = radius;
		this.angle = angle;
		this.ATKMultiplier = ATKMultiplier;
		this.projectileCount = projectileCount;
		this.projectSpeed = projectSpeed;
		this.isShotgun = shotgun;
		this.statusChance = statusChange;
		this.totalEffect = totalEffect;
		this.effects = effects;
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
	 * Gets the level up cost.
	 *
	 * @return the level up cost
	 */
	public int getLevelUpCost() {
		return levelUpCost;
	}

	/**
	 * Sets the level up cost.
	 *
	 * @param levelUpCost
	 *            the new level up cost
	 */
	public void setLevelUpCost(int levelUpCost) {
		this.levelUpCost = levelUpCost;
	}

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration
	 *            the new duration
	 */
	public void setDuration(float duration) {
		this.duration = duration;
	}

	/**
	 * Gets the cast time.
	 *
	 * @return the cast time
	 */
	public float getCastTime() {
		return castTime;
	}

	/**
	 * Sets the cast time.
	 *
	 * @param castTime
	 *            the new cast time
	 */
	public void setCastTime(float castTime) {
		this.castTime = castTime;
	}

	/**
	 * Gets the cooldown.
	 *
	 * @return the cooldown
	 */
	public float getCooldown() {
		return cooldown;
	}

	/**
	 * Sets the cooldown.
	 *
	 * @param cooldown
	 *            the new cooldown
	 */
	public void setCooldown(float cooldown) {
		this.cooldown = cooldown;
	}

	/**
	 * Gets the target.
	 *
	 * @return the target
	 */
	public TargetType getTarget() {
		return target;
	}

	/**
	 * Sets the target.
	 *
	 * @param target
	 *            the new target
	 */
	public void setTarget(TargetType target) {
		this.target = target;
	}

	/**
	 * Gets the target range.
	 *
	 * @return the target range
	 */
	public float getTargetRange() {
		return targetRange;
	}

	/**
	 * Sets the target range.
	 *
	 * @param targetRange
	 *            the new target range
	 */
	public void setTargetRange(float targetRange) {
		this.targetRange = targetRange;
	}

	/**
	 * Gets the radius.
	 *
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * Sets the radius.
	 *
	 * @param radius
	 *            the new radius
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * Gets the angle.
	 *
	 * @return the angle
	 */
	public int getAngle() {
		return angle;
	}

	/**
	 * Sets the angle.
	 *
	 * @param angle
	 *            the new angle
	 */
	public void setAngle(int angle) {
		this.angle = angle;
	}

	/**
	 * Gets the ATK multiplier.
	 *
	 * @return the ATK multiplier
	 */
	public float getATKMultiplier() {
		return ATKMultiplier;
	}

	/**
	 * Sets the ATK multiplier.
	 *
	 * @param aTKMultiplier
	 *            the new ATK multiplier
	 */
	public void setATKMultiplier(float aTKMultiplier) {
		ATKMultiplier = aTKMultiplier;
	}

	/**
	 * Gets the projectile count.
	 *
	 * @return the projectile count
	 */
	public int getProjectileCount() {
		return projectileCount;
	}

	/**
	 * Sets the projectile count.
	 *
	 * @param projectileCount
	 *            the new projectile count
	 */
	public void setProjectileCount(int projectileCount) {
		this.projectileCount = projectileCount;
	}

	/**
	 * Gets the project speed.
	 *
	 * @return the project speed
	 */
	public float getProjectSpeed() {
		return projectSpeed;
	}

	/**
	 * Sets the project speed.
	 *
	 * @param projectSpeed
	 *            the new project speed
	 */
	public void setProjectSpeed(float projectSpeed) {
		this.projectSpeed = projectSpeed;
	}

	/**
	 * Checks if is shotgun.
	 *
	 * @return true, if is shotgun
	 */
	public boolean isShotgun() {
		return isShotgun;
	}

	/**
	 * Sets the shotgun.
	 *
	 * @param shotgun
	 *            the new shotgun
	 */
	public void setShotgun(boolean shotgun) {
		this.isShotgun = shotgun;
	}

	/**
	 * Gets the status change.
	 *
	 * @return the status change
	 */
	public float getStatusChange() {
		return statusChance;
	}

	/**
	 * Sets the status change.
	 *
	 * @param statusChange
	 *            the new status change
	 */
	public void setStatusChange(int statusChange) {
		this.statusChance = statusChange;
	}

	/**
	 * Gets the total effect.
	 *
	 * @return the total effect
	 */
	public int getTotalEffect() {
		return totalEffect;
	}

	/**
	 * Sets the total effect.
	 *
	 * @param totalEffect
	 *            the new total effect
	 */
	public void setTotalEffect(int totalEffect) {
		this.totalEffect = totalEffect;
	}

	/**
	 * Gets the effects.
	 *
	 * @return the effects
	 */
	public List<SkillEffect> getEffects() {
		return effects;
	}

	/**
	 * Sets the effects.
	 *
	 * @param effects
	 *            the new effects
	 */
	public void setEffects(List<SkillEffect> effects) {
		this.effects = effects;
	}

}
