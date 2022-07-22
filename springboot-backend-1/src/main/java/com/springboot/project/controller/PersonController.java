package com.springboot.project.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.model.Person;
import com.springboot.project.services.PersonServices;

@RestController
@RequestMapping("/api")
public class PersonController {

	private PersonServices personServices;

	public PersonController(PersonServices personServices) {
		super();
		this.personServices = personServices;
	}
	
	
	@PostMapping("add")
	public ResponseEntity<Person> savePerson(@RequestBody Person person){
		
		
		return new ResponseEntity<Person>(personServices.savePerson(person), HttpStatus.CREATED) ;
			//new ResponseEntity<Person>(personServices.savePerson(person));
	}

	

}
