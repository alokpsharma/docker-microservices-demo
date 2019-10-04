/**
 * 
 */
package com.alokpsharma.microservices.customer.models;

import java.io.Serializable;

/**
 * @author alokpsharma
 *
 */

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1750998426306445702L;


	private String streetName;

	private String city;

	private String state;

	private Integer zipCode;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
}
