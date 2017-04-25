package org.dcc.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能类型
 * 
 */

@SuppressWarnings("serial")
public class FunctionalType implements java.io.Serializable {

	// Fields

	private Long ftUid;
	private String ftDesc;

//	private Set funcCats = new HashSet(0);
	private Set categorys = new HashSet(0);

//	private Set relFts = new HashSet(0);

	// private Set productTestings = new HashSet(0);
	// private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public FunctionalType() {
	}

	/** minimal constructor */
	public FunctionalType(Long ftUid, String ftDesc) {
		this.ftUid = ftUid;
		this.ftDesc = ftDesc;
	}

	// /** full constructor */
	// public FunctionalType(Long ftUid, String ftDesc, Set relFts, Set
	// funcCats, Set productTestings, Set products) {
	// this.ftUid = ftUid;
	// this.ftDesc = ftDesc;
	// this.relFts = relFts;
	// this.funcCats = funcCats;
	// this.productTestings = productTestings;
	// this.products = products;
	// // }

	// Property accessors

	public Long getFtUid() {
		return this.ftUid;
	}

	public void setFtUid(Long ftUid) {
		this.ftUid = ftUid;
	}

	public String getFtDesc() {
		return this.ftDesc;
	}

	public void setFtDesc(String ftDesc) {
		this.ftDesc = ftDesc;
	}

//	public Set getRelFts() {
//		return this.relFts;
//	}
//
//	public void setRelFts(Set relFts) {
//		this.relFts = relFts;
//	}

//	public Set getFuncCats() {
//		return this.funcCats;
//	}
//
//	public void setFuncCats(Set funcCats) {
//		this.funcCats = funcCats;
//	}

	/**
	 * @return the categorys
	 */
	public Set getCategorys() {
		return categorys;
	}

	/**
	 * @param categorys
	 *            the categorys to set
	 */
	public void setCategorys(Set categorys) {
		this.categorys = categorys;
	}

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