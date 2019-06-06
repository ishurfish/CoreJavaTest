package org.learn.java;

import java.util.Random;

public class Student {
	//TODO: general - fix the class if there is any issue
	public final int id;		//!important: id should be auto generated and should not be modifiable
	private String firstName;
	private String lastName;
	private Address mailingAddress;
	private Address permanentAddress;
	//TODO: fix any issue for any instance variable above
	
	public Student(String firstName, String lastName, Address mailingAddress, Address permanentAddress) {
		super();
		this.id = new Random().nextInt(32);
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailingAddress = mailingAddress;
		this.permanentAddress = permanentAddress;
	}

	public int getId() {
		return id;
	}

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

	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((permanentAddress == null) ? 0 : permanentAddress.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (permanentAddress == null) {
			if (other.permanentAddress != null)
				return false;
		} else if (!permanentAddress.equals(other.permanentAddress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + "   "+"Student Name: " + lastName + ", " + firstName +"   "+ 
				"Mailing Address: " + mailingAddress + "   "+
				"Permanent Address: " + permanentAddress;
	}

}
