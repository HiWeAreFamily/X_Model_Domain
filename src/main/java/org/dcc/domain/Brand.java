package org.dcc.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 铭牌
 * 
 */

@SuppressWarnings("serial")
public class Brand implements java.io.Serializable {

	// Fields

	private Integer bid;
	private String bidDesc;
	private Set products = new HashSet(0);
	private Set servpacTrgtsyses = new HashSet(0);
	private Set productTestings = new HashSet(0);

	// Constructors

	/** default constructor */
	public Brand() {
	}

	/** minimal constructor */
	public Brand(Integer bid, String bidDesc) {
		this.bid = bid;
		this.bidDesc = bidDesc;
	}

	/** full constructor */
	public Brand(Integer bid, String bidDesc, Set products, Set servpacTrgtsyses, Set productTestings) {
		this.bid = bid;
		this.bidDesc = bidDesc;
		this.products = products;
		this.servpacTrgtsyses = servpacTrgtsyses;
		this.productTestings = productTestings;
	}

	// Property accessors

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBidDesc() {
		return this.bidDesc;
	}

	public void setBidDesc(String bidDesc) {
		this.bidDesc = bidDesc;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

	public Set getServpacTrgtsyses() {
		return this.servpacTrgtsyses;
	}

	public void setServpacTrgtsyses(Set servpacTrgtsyses) {
		this.servpacTrgtsyses = servpacTrgtsyses;
	}

	public Set getProductTestings() {
		return this.productTestings;
	}

	public void setProductTestings(Set productTestings) {
		this.productTestings = productTestings;
	}

}