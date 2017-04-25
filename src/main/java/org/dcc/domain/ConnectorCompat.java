package org.dcc.domain;

/**
 * ConnectorCompat entity. 介绍说明:
 */

public class ConnectorCompat implements java.io.Serializable {

	// Fields

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Connector connector_1;
	private Connector connector_2;

	public ConnectorCompat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConnectorCompat(Connector connector_1, Connector connector_2) {
		super();
		this.connector_1 = connector_1;
		this.connector_2 = connector_2;
	}

	/**
	 * @return the connector_2
	 */
	public Connector getConnector_2() {
		return connector_2;
	}

	/**
	 * @param connector_2
	 *            the connector_2 to set
	 */
	public void setConnector_2(Connector connector_2) {
		this.connector_2 = connector_2;
	}

	public Connector getConnector_1() {
		return connector_1;
	}

	public void setConnector_1(Connector connector_1) {
		this.connector_1 = connector_1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((connector_1 == null) ? 0 : connector_1.hashCode());
		result = prime * result + ((connector_2 == null) ? 0 : connector_2.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ConnectorCompat)) {
			return false;
		}
		ConnectorCompat other = (ConnectorCompat) obj;
		if (connector_1 == null) {
			if (other.connector_1 != null) {
				return false;
			}
		} else if (!connector_1.equals(other.connector_1)) {
			return false;
		}
		if (connector_2 == null) {
			if (other.connector_2 != null) {
				return false;
			}
		} else if (!connector_2.equals(other.connector_2)) {
			return false;
		}
		return true;
	}

}