package com.example.demo.controllers;

import com.example.demo.models.entity.Phone;
import com.example.demo.services.PhoneService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/phones")
public class PhoneController {
	private final PhoneService phoneService;

	@GetMapping("/all")
	public List<Phone> getAllPhones() {
		return phoneService.getAllPhones();
	}
}
