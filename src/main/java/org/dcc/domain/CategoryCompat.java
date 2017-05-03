package org.dcc.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * CategoryCompat 兼容性分类
 */

public class CategoryCompat implements java.io.Serializable {

	// Fields

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5237357480384295148L;

	private Long cuid;
	private String description;

	private Set categoryProdGrps = new HashSet(0);

	private Set categoryConnectors = new HashSet(0);

	private Set passthrusForCuid3 = new HashSet(0);
	private Set passthrusForCuid2 = new HashSet(0);
	private Set passthrusForCuid1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public CategoryCompat() {
	}

	/** minimal constructor */
	public CategoryCompat(Long cuid, String description) {
		this.cuid = cuid;
		this.description = description;
	}

	/** full constructor */
	public CategoryCompat(Long cuid, String description, Set passthrusForCuid3, Set categoryProdGrps,
			Set passthrusForCuid2, Set categoryConnectors, Set passthrusForCuid1) {
		this.cuid = cuid;
		this.description = description;
		this.passthrusForCuid3 = passthrusForCuid3;
		this.categoryProdGrps = categoryProdGrps;
		this.passthrusForCuid2 = passthrusForCuid2;
		this.categoryConnectors = categoryConnectors;
		this.passthrusForCuid1 = passthrusForCuid1;
	}

	// Property accessors

	public Long getCuid() {
		return this.cuid;
	}

	public void setCuid(Long cuid) {
		this.cuid = cuid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getPassthrusForCuid3() {
		return this.passthrusForCuid3;
	}

	public void setPassthrusForCuid3(Set passthrusForCuid3) {
		this.passthrusForCuid3 = passthrusForCuid3;
	}

	public Set getCategoryProdGrps() {
		return this.categoryProdGrps;
	}

	public void setCategoryProdGrps(Set categoryProdGrps) {
		this.categoryProdGrps = categoryProdGrps;
	}

	public Set getPassthrusForCuid2() {
		return this.passthrusForCuid2;
	}

	public void setPassthrusForCuid2(Set passthrusForCuid2) {
		this.passthrusForCuid2 = passthrusForCuid2;
	}

	public Set getCategoryConnectors() {
		return this.categoryConnectors;
	}

	public void setCategoryConnectors(Set categoryConnectors) {
		this.categoryConnectors = categoryConnectors;
	}

	public Set getPassthrusForCuid1() {
		return this.passthrusForCuid1;
	}

	public void setPassthrusForCuid1(Set passthrusForCuid1) {
		this.passthrusForCuid1 = passthrusForCuid1;
	}

}