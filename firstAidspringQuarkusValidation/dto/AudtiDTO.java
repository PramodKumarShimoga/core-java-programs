package com.xworkz.firstAidspringQuarkusValidation.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NonNull
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AudtiDTO implements Serializable{
	
	private String createdBy;
	private LocalDateTime createdAt;
	private String updatedBy;
	private LocalDateTime updatedAt;

}
