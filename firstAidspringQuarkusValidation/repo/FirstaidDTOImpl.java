package com.xworkz.firstAidspringQuarkusValidation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Component
public class FirstaidDTOImpl implements FirstaidRepo {

	@Override
	public boolean save(MissileDTO fdto) {
		System.out.println("running save in repo");
		System.out.println("Data Saving>>>>>>"+fdto);
		return true;
	}

}
