package com.kh.object;

public class Product {
	private String id; 		// 상품 아이디
	private String name;    // 상품명
	private String site;    // 생산지
	private int price;      // 가격
	private double tax;     // 부가세 비율
	
	public Product() {
		
	}
	
	public Product(String id, String name, String site, int price, double tex) {
		// 초기화
		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tax = tax;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSite() {
		return site;
	}

	public int getPrice() {
		return price;
	}
	
	public double getTax() {
		return tax;
	}

	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSite(String site) {
		this.site = site;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}

	public String information(){
		// 참조타입 : null, ""
		//return ""; // = return null;
		return getId()+" "+getName() + " "+getSite() + " "+getPrice() + " "+getTax();
	};

}
