package org.dcc.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fangh1
 * 
 *         制造行业
 *
 */
public class Mfg implements java.io.Serializable {

	// Fields

	private Integer mfgId;
	private String mfgDesc;

	// private Set products = new HashSet(0);
	// private Set productTestings = new HashSet(0);

	// Constructors

	/** default constructor */
	public Mfg() {
	}

	/** minimal constructor */
	public Mfg(Integer mfgId) {
		this.mfgId = mfgId;
	}

	// /** full constructor */
	// public Mfg(Integer mfgId, String mfgDesc, Set products, Set
	// productTestings) {
	// this.mfgId = mfgId;
	// this.mfgDesc = mfgDesc;
	// this.products = products;
	// this.productTestings = productTestings;
	// }

	// Property accessors

	public Integer getMfgId() {
		return this.mfgId;
	}

	public void setMfgId(Integer mfgId) {
		this.mfgId = mfgId;
	}

	public String getMfgDesc() {
		return this.mfgDesc;
	}

	public void setMfgDesc(String mfgDesc) {
		this.mfgDesc = mfgDesc;
	}

	// public Set getProducts() {
	// return this.products;
	// }
	//
	// public void setProducts(Set products) {
	// this.products = products;
	// }
	//
	// public Set getProductTestings() {
	// return this.productTestings;
	// }
	//
	// public void setProductTestings(Set productTestings) {
	// this.productTestings = productTestings;
	// }

}