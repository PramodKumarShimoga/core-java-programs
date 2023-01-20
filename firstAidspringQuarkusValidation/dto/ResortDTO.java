package com.xworkz.firstAidspringQuarkusValidation.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@NonNull

public class ResortDTO extends AudtiDTO{
	@NotNull
	@NotBlank
	@Size(min=3,max=30)
	private String resortName;
	private double resortRent;
	@NotNull
	@NotBlank
	@Size(min=3,max=30)
	private String resortLocation;
	
	

}

