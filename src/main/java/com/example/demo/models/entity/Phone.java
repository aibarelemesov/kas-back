package com.example.demo.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "phones")
@Getter
@Setter
public class Phone {
	@Id
	private Long id;
	@Column(name = "img_url")
	private String imgUrl;
	@Column(name = "brand")
	private String brand;
	@Column(name = "phone_name")
	private String phoneName;
	@Column(name = "has_nfc")
	private String hasNfc;
	@Column(name = "color")
	private String color;
	@Column(name = "diagonal_inch")
	private Long diagonalInch;
	@Column(name = "ram")
	private Long ram;
	@Column(name = "processor")
	private String processor;
	@Column(name = "memory")
	private Long memory;
	@Column(name = "accum_vol")
	private Long accumVol;
}
