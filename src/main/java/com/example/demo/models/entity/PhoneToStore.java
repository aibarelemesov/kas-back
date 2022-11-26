package com.example.demo.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "phone_store_availabale")
@Getter
@Setter
public class PhoneToStore {
	@Id
	private Long id;

	@Column(name = "phone_id")
	private Integer phoneId;

	@Column(name = "store_name")
	private String storeName;

	@Column(name = "phone_cost")
	private Integer phoneCost;
}
