package com.example.demo.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stores")
@Getter
@Setter
public class Store {
	@Id
	private Long id;
	@Column(name = "store_name")
	private String storeName;
	@Column(name = "address")
	private String address;
}
