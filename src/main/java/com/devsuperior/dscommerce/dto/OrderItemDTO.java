package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDTO {
	private Long productId;
	private String name;
	private Double price;
	private Integer quantity;

	public OrderItemDTO(Long productId, String name, Double price, Integer quantity, Double subTotal) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public OrderItemDTO(OrderItem order) {
		productId = order.getProduct().getId();
		name = order.getProduct().getName();
		price = order.getPrice();
		quantity = order.getQuantity();
	}

	public Long getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getsubTotal() {
		return quantity * price;
	}

}
