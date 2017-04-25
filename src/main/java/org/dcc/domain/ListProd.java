package org.dcc.domain;

/**
 * ListProd entity.
 * 
 * 中间表
 */
@SuppressWarnings("serial")
public class ListProd implements java.io.Serializable {

	// Fields

	private ListProdId id;// 主键

	// Constructors

	/** default constructor */
	public ListProd() {
	}

	/** minimal constructor */
	public ListProd(ListProdId id) {
		this.id = id;
	}

	// Property accessors

	public ListProdId getId() {
		return this.id;
	}

	public void setId(ListProdId id) {
		this.id = id;
	}

}