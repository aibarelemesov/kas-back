package com.example.demo.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PhoneStoreCost {
	private String storeName;
	private String brand;
	private String phoneName;
	private Integer phoneCost;
}
