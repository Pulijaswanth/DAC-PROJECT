package com.Go.pojo;
public class Cart{
	private int id;
	private String name;
	private String price;
	private String size;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Cart(int id, String name, String price, String size) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.size = size;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}