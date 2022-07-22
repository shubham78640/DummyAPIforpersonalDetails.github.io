package com.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.model.BankDetails;

public interface BankDetailsRepository extends JpaRepository<BankDetails, Long> {

}
