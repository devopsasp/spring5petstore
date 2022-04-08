package com.model;

import javax.persistence.*;
@Entity
public class Item {
	
	@Id
	@GeneratedValue
	private int itemId;
	private String itemName;
	private float price;
	
	public Item() {}

	
	
	
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}





	public Item( String itemName, float price) {
		super();
	
		this.itemName = itemName;
		this.price = price;
	}





	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	

}
