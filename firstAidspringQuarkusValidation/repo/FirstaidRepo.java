package com.xworkz.firstAidspringQuarkusValidation.repo;

import com.xworkz.firstAidspringQuarkusValidation.dto.FirstAidDTO;
import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;

public interface FirstaidRepo {
	
	boolean save(FirstAidDTO dto);

}
