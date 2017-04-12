/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata.subitem;

import com.sgs.game.sgsr.server.dto.enumitem.TargetType;

// TODO: Auto-generated Javadoc
/**
 * The Class SkillEffect.
 */
public class SkillEffect {

	/** The stat. */
	private String stat;

	/** The target. */
	private TargetType target;

	/** The amount. */
	private float amount;

	/** The duration. */
	private float duration;

	/** The operator. */
	private String operator;

	/**
	 * Instantiates a new skill effect.
	 */
	public SkillEffect() {
	}

	/**
	 * Instantiates a new skill effect.
	 *
	 * @param stat
	 *            the stat
	 * @param target
	 *            the target
	 * @param amount
	 *            the amount
	 * @param duration
	 *            the duration
	 * @param operator
	 *            the operator
	 */
	public SkillEffect(String stat, TargetType target, float amount, float duration, String operator) {
		this.stat = stat;
		this.target = target;
		this.amount = amount;
		this.duration = duration;
		this.operator = operator;
	}

	/**
	 * Gets the stat.
	 *
	 * @return the stat
	 */
	public String getStat() {
		return stat;
	}

	/**
	 * Sets the stat.
	 *
	 * @param stat
	 *            the new stat
	 */
	public void setStat(String stat) {
		this.stat = stat;
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
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount
	 *            the new amount
	 */
	public void setAmount(float amount) {
		this.amount = amount;
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
	 * Gets the operator.
	 *
	 * @return the operator
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * Sets the operator.
	 *
	 * @param operator
	 *            the new operator
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
