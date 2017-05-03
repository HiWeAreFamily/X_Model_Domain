package org.dcc.domain;

/**
 * ListProdId entity. 介绍说明:
 */

@SuppressWarnings("serial")
public class ListProdId implements java.io.Serializable {

	// Fields
	// 实际上2个字段

	private ListCat listCat;
	private Long puid;

	// Constructors

	/** default constructor */
	public ListProdId() {
	}

	/** full constructor */
	public ListProdId(ListCat listCat, Long puid) {
		this.listCat = listCat;
		this.puid = puid;
	}

	// Property accessors

	public ListCat getListCat() {
		return this.listCat;
	}

	public void setListCat(ListCat listCat) {
		this.listCat = listCat;
	}

	public Long getPuid() {
		return this.puid;
	}

	public void setPuid(Long puid) {
		this.puid = puid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ListProdId))
			return false;
		ListProdId castOther = (ListProdId) other;

		return ((this.getListCat() == castOther.getListCat()) || (this.getListCat() != null
				&& castOther.getListCat() != null && this.getListCat().equals(castOther.getListCat())))
				&& ((this.getPuid() == castOther.getPuid()) || (this.getPuid() != null && castOther.getPuid() != null && this
						.getPuid().equals(castOther.getPuid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getListCat() == null ? 0 : this.getListCat().hashCode());
		result = 37 * result + (getPuid() == null ? 0 : this.getPuid().hashCode());
		return result;
	}

}