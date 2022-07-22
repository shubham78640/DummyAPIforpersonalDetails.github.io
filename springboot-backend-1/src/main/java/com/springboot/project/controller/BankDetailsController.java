package com.springboot.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.model.BankDetails;
import com.springboot.project.repository.BankDetailsRepository;

@RestController
public class BankDetailsController {

	@Autowired
	BankDetailsRepository bankDetailsRepository;
	
	@PostMapping("/bank")
	public BankDetails save(@RequestBody BankDetails bankDetails) {
		return bankDetailsRepository.save(bankDetails);
	}

}
