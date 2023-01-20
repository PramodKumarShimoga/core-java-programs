package com.xworkz.firstAidspringQuarkusValidation.service;

import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;

public interface FirstaidService {
	
	boolean saveAndValidate(MissileDTO vfdto);

}
