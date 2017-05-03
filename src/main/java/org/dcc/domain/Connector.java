package org.dcc.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Connector
 */

public class Connector implements java.io.Serializable {

	// Fields

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Long connUid;
	private String connDesc;
	private String gender;

	// private Set connectorCompatsForConn1Uid = new HashSet(0);
	// private Set connectorCompatsForConn2Uid = new HashSet(0);

	// private Set<CategoryConnector> categoryConnectors = new
	// HashSet<CategoryConnector>(0);

	private Set prodP2pLocations = new HashSet(0);
	private Set connLayoutMaps = new HashSet(0);
	private Set connectorReplcmntsForDefaultConnUid = new HashSet(0);
	private Set prdSlots = new HashSet(0);
	private Set fillerses = new HashSet(0);
	private Set slotMis = new HashSet(0);
	private Set connectorReplcmntsForReplaceConnUid = new HashSet(0);
	private Set connectorNets = new HashSet(0);

	// Constructors

	/** default constructor */
	public Connector() {
	}

	/** minimal constructor */
	public Connector(Long connUid, String connDesc) {
		this.connUid = connUid;
		this.connDesc = connDesc;
	}

	/** full constructor */
	public Connector(Long connUid, String connDesc, String gender, Set prodP2pLocations, Set connLayoutMaps,
			Set connectorReplcmntsForDefaultConnUid, Set prdSlots, Set fillerses,/*
																				 * Set
																				 * connectorCompatsForConn1Uid
																				 * ,
																				 */Set slotMis,
			Set connectorReplcmntsForReplaceConnUid, Set categoryConnectors, /*
																			 * Set
																			 * connectorCompatsForConn2Uid
																			 * ,
																			 */Set connectorNets) {
		this.connUid = connUid;
		this.connDesc = connDesc;
		this.gender = gender;
		this.prodP2pLocations = prodP2pLocations;
		this.connLayoutMaps = connLayoutMaps;
		this.connectorReplcmntsForDefaultConnUid = connectorReplcmntsForDefaultConnUid;
		this.prdSlots = prdSlots;
		this.fillerses = fillerses;
		// this.connectorCompatsForConn1Uid = connectorCompatsForConn1Uid;
		this.slotMis = slotMis;
		this.connectorReplcmntsForReplaceConnUid = connectorReplcmntsForReplaceConnUid;
		// this.categoryConnectors = categoryConnectors;
		// this.connectorCompatsForConn2Uid = connectorCompatsForConn2Uid;
		this.connectorNets = connectorNets;
	}

	// Property accessors

	public Long getConnUid() {
		return this.connUid;
	}

	public void setConnUid(Long connUid) {
		this.connUid = connUid;
	}

	public String getConnDesc() {
		return this.connDesc;
	}

	public void setConnDesc(String connDesc) {
		this.connDesc = connDesc;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set getProdP2pLocations() {
		return this.prodP2pLocations;
	}

	public void setProdP2pLocations(Set prodP2pLocations) {
		this.prodP2pLocations = prodP2pLocations;
	}

	public Set getConnLayoutMaps() {
		return this.connLayoutMaps;
	}

	public void setConnLayoutMaps(Set connLayoutMaps) {
		this.connLayoutMaps = connLayoutMaps;
	}

	public Set getConnectorReplcmntsForDefaultConnUid() {
		return this.connectorReplcmntsForDefaultConnUid;
	}

	public void setConnectorReplcmntsForDefaultConnUid(Set connectorReplcmntsForDefaultConnUid) {
		this.connectorReplcmntsForDefaultConnUid = connectorReplcmntsForDefaultConnUid;
	}

	public Set getPrdSlots() {
		return this.prdSlots;
	}

	public void setPrdSlots(Set prdSlots) {
		this.prdSlots = prdSlots;
	}

	public Set getFillerses() {
		return this.fillerses;
	}

	public void setFillerses(Set fillerses) {
		this.fillerses = fillerses;
	}

	//
	// public Set getConnectorCompatsForConn1Uid() {
	// return this.connectorCompatsForConn1Uid;
	// }
	//
	// public void setConnectorCompatsForConn1Uid(Set
	// connectorCompatsForConn1Uid) {
	// this.connectorCompatsForConn1Uid = connectorCompatsForConn1Uid;
	// }

	public Set getSlotMis() {
		return this.slotMis;
	}

	public void setSlotMis(Set slotMis) {
		this.slotMis = slotMis;
	}

	public Set getConnectorReplcmntsForReplaceConnUid() {
		return this.connectorReplcmntsForReplaceConnUid;
	}

	public void setConnectorReplcmntsForReplaceConnUid(Set connectorReplcmntsForReplaceConnUid) {
		this.connectorReplcmntsForReplaceConnUid = connectorReplcmntsForReplaceConnUid;
	}

	// public Set getCategoryConnectors() {
	// return this.categoryConnectors;
	// }
	//
	// public void setCategoryConnectors(Set categoryConnectors) {
	// this.categoryConnectors = categoryConnectors;
	// }
	//
	// public Set getConnectorCompatsForConn2Uid() {
	// return this.connectorCompatsForConn2Uid;
	// }
	//
	// public void setConnectorCompatsForConn2Uid(Set
	// connectorCompatsForConn2Uid) {
	// this.connectorCompatsForConn2Uid = connectorCompatsForConn2Uid;
	// }

	public Set getConnectorNets() {
		return this.connectorNets;
	}

	public void setConnectorNets(Set connectorNets) {
		this.connectorNets = connectorNets;
	}

}