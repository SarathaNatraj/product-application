package com.example.productapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data // Lombok to reduce boilerplate code (optional)
@AllArgsConstructor
@Setter
@Getter
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    public Product(String name, String desc, float price) {
    	this.name=name;
    	this.description=desc;
    	this.price=price;
    			
    }
	public Product() {
		// TODO Auto-generated constructor stub
	}
    
    
}

