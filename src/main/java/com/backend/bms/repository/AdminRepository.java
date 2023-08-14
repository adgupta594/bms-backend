package com.backend.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.bms.model.Admins;

public interface AdminRepository extends JpaRepository<Admins, Long> {
	

}
