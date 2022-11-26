package com.example.demo.services;

import com.example.demo.models.dto.PhoneStoreCost;
import com.example.demo.models.entity.PhoneToStore;
import com.example.demo.repositories.PhoneToStoreRepostitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneToStoreService {

	private final PhoneToStoreRepostitory phoneToStoreRepostitory;

	public List<PhoneStoreCost> getAllPhoneToStore() {
		return phoneToStoreRepostitory.getPhoneStoreCost();
	}
}
