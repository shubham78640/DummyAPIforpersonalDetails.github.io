package com.springboot.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Table(name="bankDetails")
@Entity
@Data
public class BankDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@Column(name="bank_name", nullable = false)
	private String banktName;
	
	@Column(name="branch_name")
	private String branchName;
	
	@Column(name="branch_address")
	private String branchAddress;
	
	@Column(name="account_holder_name")
	private String accountHolderName;
	
	@Column(name="ifsc_code")
	private String ifscCode;
	
	@Column(name="account_number")
	private long accountNumber;
	
	@Enumerated(EnumType.STRING)
	private AccountType AccountType;

	public BankDetails(long id, String banktName, String branchName, String branchAddress, String accountHolderName,
			String ifscCode, long accountNumber, com.springboot.project.model.AccountType accountType) {
		super();
		this.id = id;
		this.banktName = banktName;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
		this.accountHolderName = accountHolderName;
		this.ifscCode = ifscCode;
		this.accountNumber = accountNumber;
		AccountType = accountType;
	}

	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BankDetails [id=" + id + ", banktName=" + banktName + ", branchName=" + branchName + ", branchAddress="
				+ branchAddress + ", accountHolderName=" + accountHolderName + ", ifscCode=" + ifscCode
				+ ", accountNumber=" + accountNumber + ", AccountType=" + AccountType + "]";
	}
	
	
	
	
}
