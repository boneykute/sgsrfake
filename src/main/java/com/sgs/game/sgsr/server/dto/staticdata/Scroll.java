/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dto.staticdata;

import java.util.List;

import com.sgs.game.sgsr.server.dto.enumitem.ElementType;
import com.sgs.game.sgsr.server.dto.enumitem.RarityType;

// TODO: Auto-generated Javadoc
/**
 * The Class Scroll.
 */
public class Scroll extends BaseStaticDataDTO<Scroll> {

	/** The rarity. */
	private RarityType rarity;

	/** The element count. */
	private int elementCount;

	/** The elements. */
	private List<ElementType> elements;

	/** The common percent. */
	private float commonPercent;

	/** The rare percent. */
	private float rarePercent;

	/** The epic percent. */
	private float epicPercent;

	/** The legendary percent. */
	private float legendaryPercent;

	/**
	 * Instantiates a new scroll.
	 */
	public Scroll() {
		super();
	}

	/**
	 * Instantiates a new scroll.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param rarity
	 *            the rarity
	 * @param elementCount
	 *            the element count
	 * @param elements
	 *            the elements
	 * @param commonPercent
	 *            the common percent
	 * @param rarePercent
	 *            the rare percent
	 * @param epicPercent
	 *            the epic percent
	 * @param legendaryPercent
	 *            the legendary percent
	 */
	public Scroll(int id, String name, String description, RarityType rarity, int elementCount,
			List<ElementType> elements, float commonPercent, float rarePercent, float epicPercent,
			float legendaryPercent) {
		super(id, name, description);
		this.rarity = rarity;
		this.elementCount = elementCount;
		this.elements = elements;
		this.commonPercent = commonPercent;
		this.rarePercent = rarePercent;
		this.epicPercent = epicPercent;
		this.legendaryPercent = legendaryPercent;
	}

	/**
	 * Gets the rarity.
	 *
	 * @return the rarity
	 */
	public RarityType getRarity() {
		return rarity;
	}

	/**
	 * Sets the rarity.
	 *
	 * @param rarity
	 *            the new rarity
	 */
	public void setRarity(RarityType rarity) {
		this.rarity = rarity;
	}

	/**
	 * Gets the element count.
	 *
	 * @return the element count
	 */
	public int getElementCount() {
		return elementCount;
	}

	/**
	 * Sets the element count.
	 *
	 * @param elementCount
	 *            the new element count
	 */
	public void setElementCount(int elementCount) {
		this.elementCount = elementCount;
	}

	/**
	 * Gets the elements.
	 *
	 * @return the elements
	 */
	public List<ElementType> getElements() {
		return elements;
	}

	/**
	 * Sets the elements.
	 *
	 * @param elements
	 *            the new elements
	 */
	public void setElements(List<ElementType> elements) {
		this.elements = elements;
	}

	/**
	 * Gets the common percent.
	 *
	 * @return the common percent
	 */
	public float getCommonPercent() {
		return commonPercent;
	}

	/**
	 * Sets the common percent.
	 *
	 * @param commonPercent
	 *            the new common percent
	 */
	public void setCommonPercent(float commonPercent) {
		this.commonPercent = commonPercent;
	}

	/**
	 * Gets the rare percent.
	 *
	 * @return the rare percent
	 */
	public float getRarePercent() {
		return rarePercent;
	}

	/**
	 * Sets the rare percent.
	 *
	 * @param rarePercent
	 *            the new rare percent
	 */
	public void setRarePercent(float rarePercent) {
		this.rarePercent = rarePercent;
	}

	/**
	 * Gets the epic percent.
	 *
	 * @return the epic percent
	 */
	public float getEpicPercent() {
		return epicPercent;
	}

	/**
	 * Sets the epic percent.
	 *
	 * @param epicPercent
	 *            the new epic percent
	 */
	public void setEpicPercent(float epicPercent) {
		this.epicPercent = epicPercent;
	}

	/**
	 * Gets the legendary percent.
	 *
	 * @return the legendary percent
	 */
	public float getLegendaryPercent() {
		return legendaryPercent;
	}

	/**
	 * Sets the legendary percent.
	 *
	 * @param legendaryPercent
	 *            the new legendary percent
	 */
	public void setLegendaryPercent(float legendaryPercent) {
		this.legendaryPercent = legendaryPercent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO#clone()
	 */
	@Override
	protected Scroll clone() {
		return new Scroll(id, name, description, rarity, elementCount, elements, commonPercent, rarePercent,
				epicPercent, legendaryPercent);
	}

}
