package com.xworkz.firstAidspringQuarkusValidation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.firstAidspringQuarkusValidation.dto.ResortDTO;
@Component
public class resortDTORepoImpl implements ResortDTORepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Saved Dto : " +dto);
		return true;
	}

}
