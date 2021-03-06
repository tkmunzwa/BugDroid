package fr.julienvermet.bugdroid.products;

import java.io.Serializable;

public class Product implements Serializable {

	protected String name;
	protected String description;
	protected int image;
	
	public Product(String name, String description, int image) {
		super();
		this.name = name;
		this.description = description;
		this.image = image;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}
}