package org.dcc.domain;

/**
 * CategoryConnector entity. 介绍说明:
 */

public class CategoryConnector implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4917679790443862873L;
	// Fields

	private CategoryCompat categoryCompat;
	private Connector connector;
	private Integer qty;

	// Constructors

	/** default constructor */
	public CategoryConnector() {
	}

	/** minimal constructor */
	public CategoryConnector(CategoryCompat categoryCompat, Integer qty) {
		this.categoryCompat = categoryCompat;
		this.qty = qty;
	}

	/** full constructor */
	public CategoryConnector(CategoryCompat categoryCompat, Connector connector, Integer qty) {
		this.categoryCompat = categoryCompat;
		this.connector = connector;
		this.qty = qty;
	}

	// Property accessors

	public CategoryCompat getCategoryCompat() {
		return this.categoryCompat;
	}

	public void setCategoryCompat(CategoryCompat categoryCompat) {
		this.categoryCompat = categoryCompat;
	}

	public Connector getConnector() {
		return this.connector;
	}

	public void setConnector(Connector connector) {
		this.connector = connector;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CategoryConnector))
			return false;
		CategoryConnector castOther = (CategoryConnector) other;

		return ((this.getCategoryCompat() == castOther.getCategoryCompat()) || (this.getCategoryCompat() != null
				&& castOther.getCategoryCompat() != null && this.getCategoryCompat().equals(
				castOther.getCategoryCompat())))
				&& ((this.getConnector() == castOther.getConnector()) || (this.getConnector() != null
						&& castOther.getConnector() != null && this.getConnector().equals(castOther.getConnector())))
				&& ((this.getQty() == castOther.getQty()) || (this.getQty() != null && castOther.getQty() != null && this
						.getQty().equals(castOther.getQty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCategoryCompat() == null ? 0 : this.getCategoryCompat().hashCode());
		result = 37 * result + (getConnector() == null ? 0 : this.getConnector().hashCode());
		result = 37 * result + (getQty() == null ? 0 : this.getQty().hashCode());
		return result;
	}
}