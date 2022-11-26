package com.example.demo.repositories;

import com.example.demo.models.dto.PhoneStoreCost;
import com.example.demo.models.entity.PhoneToStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneToStoreRepostitory extends JpaRepository<PhoneToStore,Long> {

	@Query("select new com.example.demo.models.dto.PhoneStoreCost(psa.storeName, p.brand, p.phoneName, psa.phoneCost) from PhoneToStore psa join Phone p on psa.phoneId = p.id join Store s on psa.storeName = s.storeName")
	List<PhoneStoreCost> getPhoneStoreCost();



}
