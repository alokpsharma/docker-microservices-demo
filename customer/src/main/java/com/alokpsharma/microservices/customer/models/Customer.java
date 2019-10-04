/**
 * 
 */
package com.alokpsharma.microservices.customer.models;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author alokpsharma
 *
 */
@Document(collection = "customers")
public class Customer implements Serializable {

	private static final long serialVersionUID = 2176467627845093463L;

	@Id
	public ObjectId _id;

    private String firstName;
    private String lastName;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Integer membershipId;

    private String phone;

    private List<Address> address;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
