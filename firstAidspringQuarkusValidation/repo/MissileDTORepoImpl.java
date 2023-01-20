package com.xworkz.firstAidspringQuarkusValidation.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;
@Component
public class MissileDTORepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO dto) {		
		System.out.println("Data Saving>>>>>>"+dto);
		return true;
	}

}
