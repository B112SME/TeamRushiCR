package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class PersonalDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private int customerId;
	private String fatherName;
	private String motherName;
	private int noOfFamilyMember;
	private int noOfChild;
	private String maritalStatus;
	private int dpendentMember;
	private double familyIncome;
	private String spouseName;
	private String nationality;

}
