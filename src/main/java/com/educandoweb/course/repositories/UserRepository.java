package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{
	
	
}
