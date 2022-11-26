package com.example.demo.controllers;

import com.example.demo.models.dto.PhoneStoreCost;
import com.example.demo.models.entity.PhoneToStore;
import com.example.demo.services.PhoneToStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/phoneToStore")
public class PhoneToStoreController {
	private final PhoneToStoreService phoneToStoreService;

	@GetMapping("/all")
	public List<PhoneStoreCost> getAllPhoneToStore() {
		return phoneToStoreService.getAllPhoneToStore();
	}

}
