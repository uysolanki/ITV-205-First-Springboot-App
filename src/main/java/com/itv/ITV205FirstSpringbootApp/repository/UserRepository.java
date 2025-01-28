package com.itv.ITV205FirstSpringbootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itv.ITV205FirstSpringbootApp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
      public User findByUsername(String s);
}
