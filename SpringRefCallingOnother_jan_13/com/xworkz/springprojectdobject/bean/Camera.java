package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	public Lens lens;
	@Autowired
	public Battery battery;
	@Value("Nikon")
	private String cameraName;
	@Override
	public String toString() {
		return "Camera [cameraName=" + cameraName + "]";
	}
	public Camera() {
		System.out.println("Created camera using No Arg Constructor......");
	}
	
	

}
