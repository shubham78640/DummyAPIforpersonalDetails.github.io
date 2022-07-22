package com.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.model.Person;



public interface PersonRepository extends JpaRepository<Person, Long>{

}
