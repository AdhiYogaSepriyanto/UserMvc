package com.example.MvcMysql;

import java.util.List;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<Tbluser> listAll() {
		return repo.findAll();
	}
	
	public void save(Tbluser tbluser) {
		repo.save(tbluser);
	}
	
	public Tbluser get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}