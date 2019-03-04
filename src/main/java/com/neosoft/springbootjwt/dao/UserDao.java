package com.neosoft.springbootjwt.dao;

import com.neosoft.springbootjwt.model.User;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByUsername(String username);

	Optional<User> findById(int id);
}
