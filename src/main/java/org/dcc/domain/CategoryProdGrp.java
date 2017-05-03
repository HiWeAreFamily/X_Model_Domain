package org.dcc.domain;

/**
 * CategoryProdGrp entity. 介绍说明:
 */

public class CategoryProdGrp implements java.io.Serializable {

	// Fields

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -832768727263760721L;

	// private Long puid;

	private Product product;
	private CategoryCompat categoryCompat;

	// Constructors

	/** default constructor */
	public CategoryProdGrp() {
	}

	/** full constructor */
	public CategoryProdGrp(Product product, CategoryCompat categoryCompat) {
		// this.puid = puid;
		this.product = product;
		this.categoryCompat = categoryCompat;
	}

	// Property accessors

	// public Long getPuid() {
	// return this.puid;
	// }
	//
	// public void setPuid(Long puid) {
	// this.puid = puid;
	// }
	//
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CategoryCompat getCategoryCompat() {
		return this.categoryCompat;
	}

	public void setCategoryCompat(CategoryCompat categoryCompat) {
		this.categoryCompat = categoryCompat;
	}

}