package com.tht.springbooksimpleproject.userDetails;


// Not using Lombok intentionally.
public class User {
	private int id;
	private String name;
	private String email;
	private long phoneNo;
	private String loc;
	private String dob;
	
	public User() {
		
	}
	
	public User(int id, String name, String email, long phoneNo, String loc, String dob) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.loc = loc;
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("ID : ")
				.append(id)
				.append(" Name ")
				.append(name)
				.append(" Email : ")
				.append(email)
				.append(" PhoneNo  : ")
				.append(phoneNo)
				.append(" Loc : ")
				.append(loc)
				.append(" DOB : ")
				.append(dob)
				.toString();
	}
	
}
