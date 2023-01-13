package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	@Autowired
	public Camera camera;
	@Value("Sanjay_C_B")
	private String cameraMan;
	@Override
	public String toString() {
		return "CameraMan [cameraMan=" + cameraMan + "]";
	}
	public CameraMan() {
		System.out.println("Created cameraMan using No Arg Constructor......");
	}

}
