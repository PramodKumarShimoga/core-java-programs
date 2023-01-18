package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	public Director director;
	@Autowired
	public Producer producer;
	@Autowired
	public CameraMan cameraman;
	@Value("Raj_the_Man")
	private String MovieName;
	
	public Movie() {
		System.out.println("#######################Created Movie using No Arg Constructor###################################");
	}
	
	@Override
	public String toString() {
		return "Movie [MovieName=" + MovieName + "]";
	}
	
	public void movieInfo()
	{
		System.out.println("#######################################################################");
		System.out.println(director);
		System.out.println(director.experience);
		System.out.println(director.skill);
		System.out.println("#######################################################################");
		System.out.println(producer);
		System.out.println(producer.assistant);
		System.out.println(producer.company);
		System.out.println(producer.company.location);
		System.out.println(producer.company.location.area);
		System.out.println("#######################################################################");
		System.out.println(cameraman);
		System.out.println(cameraman.camera);
		System.out.println(cameraman.camera.lens);
		System.out.println(cameraman.camera.battery);
		System.out.println(cameraman.camera.battery.capacity);
	}
	
	
	
}
