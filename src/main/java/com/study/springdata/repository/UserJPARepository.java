package com.study.springdata.repository;

import com.study.springdata.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface UserJPARepository extends JpaRepository<User, Long>{
    User findByName(String name);
}
