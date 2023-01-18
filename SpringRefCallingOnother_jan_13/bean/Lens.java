package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lens {
	@Value("500mm")
	private String lensSize;
	public Lens() {
		System.out.println("Created Lens using No Arg Constructor......");
	}
	@Override
	public String toString() {
		return "Lens [lensSize=" + lensSize + "]";
	}

}
