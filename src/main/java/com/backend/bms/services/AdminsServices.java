package com.backend.bms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.backend.bms.model.Admins;
import com.backend.bms.repository.AdminRepository;

@Service
public class AdminsServices {
	private AdminRepository adminRepository;

	public AdminsServices(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}
	public Admins saveAdmin(Admins admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	public List<Admins> getAllAdmin() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	public Admins getAdminById(long id) {
		// TODO Auto-generated method stub
		return adminRepository.findById(id).orElseThrow();
	}

	public Admins updateAdmin(Admins admin, long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void deleteAdmin(long id) {
		// TODO Auto-generated method stub
		adminRepository.findById(id);
		adminRepository.deleteById(id);
	}
}
