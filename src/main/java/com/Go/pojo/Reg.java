package com.Go.pojo;

public class Reg {
	private int id;
	private String Firstname;
	private String Lastname;
	private String email;
	private String phone;
	private String area;
	private String landmark;
	private String pincode;
	private String password;
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setMobile(String phone) {
		this.phone = phone;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Reg(String Firstname,String Lastname,String email,String phone,String area,String landmark,String pincode,String password) {
		super();
		this.Firstname=Firstname;
		this.Lastname=Lastname;
		this.email=email;
		this.phone=phone;
		this.area=area;
		this.landmark=landmark;
		this.pincode=pincode;
		this.password=password;
	}
	public Reg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}