/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

// TODO: Auto-generated Javadoc
/**
 * The Class PrimaryRuneEffect.
 */
public class PrimaryRuneEffect {

	/** The effect bonus type. */
	private String effectBonusType;

	/** The effect bonus trigger. */
	private String effectBonusTrigger;

	/** The trigger percent. */
	private float triggerPercent;

	/** The effect bonus target. */
	private String effectBonusTarget;

	/** The duration. */
	private float duration;

	/** The cooldown. */
	private float cooldown;

	/**
	 * Instantiates a new primary rune effect.
	 */
	public PrimaryRuneEffect() {
		super();
	}

	/**
	 * Instantiates a new primary rune effect.
	 *
	 * @param effectBonusType
	 *            the effect bonus type
	 * @param effectBonusTrigger
	 *            the effect bonus trigger
	 * @param triggerPercent
	 *            the trigger percent
	 * @param effectBonusTarget
	 *            the effect bonus target
	 * @param duration
	 *            the duration
	 * @param cooldown
	 *            the cooldown
	 */
	public PrimaryRuneEffect(String effectBonusType, String effectBonusTrigger, float triggerPercent,
			String effectBonusTarget, float duration, float cooldown) {
		this.effectBonusType = effectBonusType;
		this.effectBonusTrigger = effectBonusTrigger;
		this.triggerPercent = triggerPercent;
		this.effectBonusTarget = effectBonusTarget;
		this.duration = duration;
		this.cooldown = cooldown;
	}

	/**
	 * Gets the effect bonus type.
	 *
	 * @return the effect bonus type
	 */
	public String getEffectBonusType() {
		return effectBonusType;
	}

	/**
	 * Sets the effect bonus type.
	 *
	 * @param effectBonusType
	 *            the new effect bonus type
	 */
	public void setEffectBonusType(String effectBonusType) {
		this.effectBonusType = effectBonusType;
	}

	/**
	 * Gets the effect bonus trigger.
	 *
	 * @return the effect bonus trigger
	 */
	public String getEffectBonusTrigger() {
		return effectBonusTrigger;
	}

	/**
	 * Sets the effect bonus trigger.
	 *
	 * @param effectBonusTrigger
	 *            the new effect bonus trigger
	 */
	public void setEffectBonusTrigger(String effectBonusTrigger) {
		this.effectBonusTrigger = effectBonusTrigger;
	}

	/**
	 * Gets the trigger percent.
	 *
	 * @return the trigger percent
	 */
	public float getTriggerPercent() {
		return triggerPercent;
	}

	/**
	 * Sets the trigger percent.
	 *
	 * @param triggerPercent
	 *            the new trigger percent
	 */
	public void setTriggerPercent(float triggerPercent) {
		this.triggerPercent = triggerPercent;
	}

	/**
	 * Gets the effect bonus target.
	 *
	 * @return the effect bonus target
	 */
	public String getEffectBonusTarget() {
		return effectBonusTarget;
	}

	/**
	 * Sets the effect bonus target.
	 *
	 * @param effectBonusTarget
	 *            the new effect bonus target
	 */
	public void setEffectBonusTarget(String effectBonusTarget) {
		this.effectBonusTarget = effectBonusTarget;
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

}
