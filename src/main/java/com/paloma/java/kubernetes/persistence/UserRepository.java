package com.paloma.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.paloma.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

