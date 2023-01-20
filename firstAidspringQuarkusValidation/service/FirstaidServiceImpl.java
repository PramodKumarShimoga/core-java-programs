package com.xworkz.firstAidspringQuarkusValidation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import javax.validation.Validator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.firstAidspringQuarkusValidation.dto.FirstAidDTO;
import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;
import com.xworkz.firstAidspringQuarkusValidation.repo.FirstaidRepo;
@Component
public class FirstaidServiceImpl implements FirstaidService {
	@Autowired
	private Validator validator;
	private FirstaidRepo frepo;
	
	@Autowired
	public FirstaidServiceImpl(FirstaidRepo frepo) {
		this.frepo=frepo;
		
		System.out.println("Created Service by passing repo>>>>>>>>>>>from >>>>>>>>>spring");
	}

	@Override
	public boolean saveAndValidate(FirstAidDTO vfdto) {
		
		System.out.println("<<<<<<<<<<<<running validate and save>>>>>>>>>>FirstAidDTO:"+vfdto);
		Set<ConstraintViolation<FirstAidDTO>> violations=validator.validate(vfdto);
		if(!violations.isEmpty())
		{
			System.err.println("there are errors");
			violations.forEach(e->{System.out.println("Violations are: "+e.getMessage());});
			return false;
		}
		else
		{
			System.out.println("DATA is VALID>>>>>>");
			boolean saved=frepo.save(vfdto);
			System.out.println("Data Saved Using"+saved);
			return saved;
		}
		
		
		
	}



	}
