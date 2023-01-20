package com.xworkz.firstAidspringQuarkusValidation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;
import com.xworkz.firstAidspringQuarkusValidation.repo.MissileRepo;
@Component
public class MissileDTOServiceImpl implements MissileDTOService {
	@Autowired
	private Validator validator;
	private MissileRepo  missileRepo;
	
	@Autowired
	public MissileDTOServiceImpl(MissileRepo missileRepo) {
		this.missileRepo=missileRepo;
	}
	@Override
	public boolean validateAnd(MissileDTO dto) {
		
		System.out.println("<<<<<<<<<<<<running validate and save>>>>>>>>>>MissileDTO:"+dto);

		Set<ConstraintViolation<MissileDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty())
		{
			System.err.println("there are errors");
			violations.forEach(e->{System.out.println("Violations are: "+e.getMessage());});
			return false;
		}
		else
		{
			System.out.println("DATA is VALID>>>>>>");
			boolean saved=missileRepo.save(dto);
			System.out.println("Data Saved Using"+saved);
			return saved;
		}
		
	}

}
