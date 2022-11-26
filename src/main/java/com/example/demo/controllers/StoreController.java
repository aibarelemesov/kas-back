package com.example.demo.controllers;

import com.example.demo.models.entity.Store;
import com.example.demo.services.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stores")
public class StoreController {
	private final StoreService storeService;

	@GetMapping("/all")
	public List<Store> getAllStores() {
		return storeService.getAllStores();
	}
}
