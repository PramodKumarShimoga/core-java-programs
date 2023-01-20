package com.xworkz.firstAidspringQuarkusValidation.repo;

import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;

public interface MissileRepo {
    boolean save(MissileDTO dto);
}
