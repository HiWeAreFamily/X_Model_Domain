package org.dcc.domain;

import java.util.HashSet;
import java.util.Set;

import org.apache.struts2.json.annotations.JSON;

/**
 * Release entity. 介绍说明:
 */

@SuppressWarnings("serial")
public class Release implements java.io.Serializable {

	// Fields

	private Integer ruid;
	// private SolutionCat solutionCat;
	private String description;
	private String active;

	/**
	 * Release Product
	 */
	private Set products = new HashSet(0);
	// private Set relProds = new HashSet(0);
	// private Set relFts = new HashSet(0);

	private Set relChngs = new HashSet(0);
	private Set oemGenses = new HashSet(0);
	private Set bomGenses = new HashSet(0);
	private Set e1350Dtes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Release() {
	}

	/** minimal constructor */
	public Release(Integer ruid, String description) {
		this.ruid = ruid;
		this.description = description;
	}

	// /** full constructor */
	// public Release(Integer ruid, SolutionCat solutionCat, String description,
	// String active, Set relChngs, Set oemGenses, Set bomGenses,
	// Set relProds, Set relFts, Set e1350Dtes) {
	// this.ruid = ruid;
	// this.solutionCat = solutionCat;
	// this.description = description;
	// this.active = active;
	// this.relChngs = relChngs;
	// this.oemGenses = oemGenses;
	// this.bomGenses = bomGenses;
	// this.relProds = relProds;
	// this.relFts = relFts;
	// this.e1350Dtes = e1350Dtes;
	// }

	// Property accessors

	public Integer getRuid() {
		return this.ruid;
	}

	public void setRuid(Integer ruid) {
		this.ruid = ruid;
	}

	// public SolutionCat getSolutionCat() {
	// return this.solutionCat;
	// }
	//
	// public void setSolutionCat(SolutionCat solutionCat) {
	// this.solutionCat = solutionCat;
	// }

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Set getRelChngs() {
		return this.relChngs;
	}

	public void setRelChngs(Set relChngs) {
		this.relChngs = relChngs;
	}

	public Set getOemGenses() {
		return this.oemGenses;
	}

	public void setOemGenses(Set oemGenses) {
		this.oemGenses = oemGenses;
	}

	public Set getBomGenses() {
		return this.bomGenses;
	}

	public void setBomGenses(Set bomGenses) {
		this.bomGenses = bomGenses;
	}

	// public Set getRelProds() {
	// return this.relProds;
	// }
	//
	// public void setRelProds(Set relProds) {
	// this.relProds = relProds;
	// }

	// public Set getRelFts() {
	// return this.relFts;
	// }
	//
	// public void setRelFts(Set relFts) {
	// this.relFts = relFts;
	// }

	public Set getE1350Dtes() {
		return this.e1350Dtes;
	}

	public void setE1350Dtes(Set e1350Dtes) {
		this.e1350Dtes = e1350Dtes;
	}

	/**
	 * @return the products
	 */
	@JSON(serialize = false)
	public Set getProducts() {
		return products;
	}

	/**
	 * @param products
	 *            the products to set
	 */
	public void setProducts(Set products) {
		this.products = products;
	}

}