package com.example.MvcMysql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MvcMysql.Tbluser;


public interface UserRepository extends JpaRepository<Tbluser, Long> {

}