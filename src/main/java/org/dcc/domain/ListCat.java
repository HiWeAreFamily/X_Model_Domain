package org.dcc.domain;

import java.util.Set;

/**
 * ListCat 分类
 */

@SuppressWarnings("serial")
public class ListCat implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String description;

	private Set<ListProd> listProds;

	public static final Integer SUPPORT = 999;

	// Constructors

	/** default constructor */
	public ListCat() {
	}

	/** minimal constructor */
	public ListCat(Integer cid, String description) {
		this.cid = cid;
		this.description = description;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<ListProd> getListProds() {
		return this.listProds;
	}

	public void setListProds(Set<ListProd> listProds) {
		this.listProds = listProds;
	}

}