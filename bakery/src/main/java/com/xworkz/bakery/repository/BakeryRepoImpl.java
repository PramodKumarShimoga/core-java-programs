package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;
@Repository
public class BakeryRepoImpl implements BakeryRepo {

	public BakeryRepoImpl() {
		System.out.println("Created: " + this.getClass().getSimpleName());
	}
	
	
	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("running - save ");
		return true;
	}
WifeName: DOGGY

}
