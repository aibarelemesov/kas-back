package com.example.demo.services;

import com.example.demo.models.entity.Store;
import com.example.demo.repositories.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreService {
	private final StoreRepository storeRepository;

	public List<Store> getAllStores() {
		return storeRepository.findAll();
	}
}
