package com.springboot.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="persons")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name="first_name", nullable = false)
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email; 
	 
	@Column(name="gender")
	private String gender; 
	
	@Column(name="phone")
	private long phone; 
	
	@Column(name="Alternate_phone")
	private long AlternatePhone;
	
	@Column(name="whatsaap_avilable")
	private boolean whatsaapAvilable;
	
	@Column(name="whatsaap_number")
	private long whatsaapNumber;
	
	@Column(name="covid_vaccination_status")
	private String covid_vaccination_status;
	
	
	@Column(name="marital_status")
	private String maritalStatus; 
	
	@Column(name="religion")
	private String religion; 
	
	
	@Column(name="educational_qualifications")
	private String educationalQualifications; 
	
	@Column(name="educational_remark")
	private String educationalRemark; 
	
	@Column(name="medical_conditions")
	private String medicalConditions;

	public Person(long id, String firstName, String middleName, String lastName, String email, String gender,
			long phone, long alternatePhone, boolean whatsaapAvilable, long whatsaapNumber,
			String covid_vaccination_status, String maritalStatus, String religion, String educationalQualifications,
			String educationalRemark, String medicalConditions) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.phone = phone; 
		this.AlternatePhone = alternatePhone;
		this.whatsaapAvilable = whatsaapAvilable;
		this.whatsaapNumber = whatsaapNumber;
		this.covid_vaccination_status = covid_vaccination_status;
		this.maritalStatus = maritalStatus;
		this.religion = religion;
		this.educationalQualifications = educationalQualifications;
		this.educationalRemark = educationalRemark;
		this.medicalConditions = medicalConditions;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", email=" + email + ", gender=" + gender + ", phone=" + phone + ", AlternatePhone=" + AlternatePhone
				+ ", whatsaapAvilable=" + whatsaapAvilable + ", whatsaapNumber=" + whatsaapNumber
				+ ", covid_vaccination_status=" + covid_vaccination_status + ", maritalStatus=" + maritalStatus
				+ ", religion=" + religion + ", educationalQualifications=" + educationalQualifications
				+ ", educationalRemark=" + educationalRemark + ", medicalConditions=" + medicalConditions + "]";
	} 
	
	
	
	
	
	
	
	
	
}
