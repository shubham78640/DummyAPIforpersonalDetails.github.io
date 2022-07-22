package com.springboot.project.servicesimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot.project.model.Person;
import com.springboot.project.repository.PersonRepository;
import com.springboot.project.services.PersonServices;

@Service
public class PersonServicesImp implements PersonServices{

	
	private PersonRepository personRepository;
	
	
	

    
	public PersonServicesImp(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}




	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}











//	@Override
//	public Person savePerson(Person person) {
//		// TODO Auto-generated method stub
//		return personRepository.save(null);
//	}

	
	
	
}
