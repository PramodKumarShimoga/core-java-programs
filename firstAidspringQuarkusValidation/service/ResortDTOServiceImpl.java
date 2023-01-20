package com.xworkz.firstAidspringQuarkusValidation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;
import com.xworkz.firstAidspringQuarkusValidation.dto.ResortDTO;
import com.xworkz.firstAidspringQuarkusValidation.repo.ResortDTORepo;
@Component
public class ResortDTOServiceImpl implements ResortDTOService {

	@Autowired
	private Validator validator;
	private ResortDTORepo resortDto;

	@Autowired
	 public ResortDTOServiceImpl(ResortDTORepo resortDto) {
		this.resortDto = resortDto;
	}

	@Override
	public boolean saveAndUpdate(ResortDTO dto) {
		Set<ConstraintViolation<ResortDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty())
		{
			System.err.println("there are errors");
			violations.forEach(e->{System.out.println("Violations are: "+e.getMessage());});
			return false;
		}
		else
		{
			System.out.println("DATA is VALID>>>>>>");
			boolean saved=resortDto.save(dto);
			System.out.println("Data Saved Using"+saved);
			return saved;
		}
	}

}
