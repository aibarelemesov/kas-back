package com.example.demo.services;

import com.example.demo.models.entity.Phone;
import com.example.demo.repositories.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {
	private final PhoneRepository phoneRepository;

	public List<Phone> getAllPhones() {
		return phoneRepository.findAll();
	}
}
