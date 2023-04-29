package com.Library.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Library {

	@Id
	@Column(name="Sr.No")
	private int sno;
	private String catagory;
	private String title;
	private String author;
	@Column(name="Date Of Purchase/Receipt")
	private String date;
	private String price;
	@Column(name="Purchased/Gift Recd")
	private String purchase;
	@Column(name="Rack No")
	private int rack;
	private String remarks;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPurchase() {
		return purchase;
	}
	public void setPurchase(String purchase) {
		this.purchase = purchase;
	}
	public int getRack() {
		return rack;
	}
	public void setRack(int rack) {
		this.rack = rack;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Library(int sno, String catagory, String title, String author, String date, String price, String purchase,
			int rack, String remarks) {
		super();
		this.sno = sno;
		this.catagory = catagory;
		this.title = title;
		this.author = author;
		this.date = date;
		this.price = price;
		this.purchase = purchase;
		this.rack = rack;
		this.remarks = remarks;
	}
	public Library() {
		super();
	}
	@Override
	public String toString() {
		return "Library [sno=" + sno + ", catagory=" + catagory + ", title=" + title + ", author=" + author + ", date="
				+ date + ", price=" + price + ", purchase=" + purchase + ", rack=" + rack + ", remarks=" + remarks
				+ "]";
	}
	
		
	
}
