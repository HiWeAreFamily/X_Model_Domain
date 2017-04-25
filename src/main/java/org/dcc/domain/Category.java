package org.dcc.domain;

import java.util.HashSet;
import java.util.Set;

import org.apache.struts2.json.annotations.JSON;

/**
 * 硬件的分类
 */

@SuppressWarnings("serial")
public class Category implements java.io.Serializable {

	// Fields

	private Integer catId;
	private String catDesc;
	private Character cfg;

	private Set functionTypes = new HashSet(0);

	// private Set funcCats = new HashSet(0);
	// private Set productTestings = new HashSet(0);
	// private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(Integer catId, String catDesc) {
		this.catId = catId;
		this.catDesc = catDesc;
	}

	// /** full constructor */
	// public Category(Integer catId, String catDesc, Character cfg, Set
	// funcCats, Set productTestings, Set products) {
	// this.catId = catId;
	// this.catDesc = catDesc;
	// this.cfg = cfg;
	// this.funcCats = funcCats;
	// this.productTestings = productTestings;
	// this.products = products;
	// }

	// Property accessors

	public Integer getCatId() {
		return this.catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatDesc() {
		return this.catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	public Character getCfg() {
		return this.cfg;
	}

	public void setCfg(Character cfg) {
		this.cfg = cfg;
	}

	/**
	 * @return the functionTypes
	 */
	@JSON(serialize = false)
	public Set getFunctionTypes() {
		return functionTypes;
	}

	/**
	 * @param functionTypes
	 *            the functionTypes to set
	 */
	public void setFunctionTypes(Set functionTypes) {
		this.functionTypes = functionTypes;
	}

	// public Set getFuncCats() {
	// return this.funcCats;
	// }
	//
	// public void setFuncCats(Set funcCats) {
	// this.funcCats = funcCats;
	// }
	//
	// public Set getProductTestings() {
	// return this.productTestings;
	// }
	//
	// public void setProductTestings(Set productTestings) {
	// this.productTestings = productTestings;
	// }
	//
	// public Set getProducts() {
	// return this.products;
	// }
	//
	// public void setProducts(Set products) {
	// this.products = products;
	// }

}