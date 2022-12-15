package com.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
