package com.xworkz.springAutowirewithconst.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Engine {

private String name;
private String type;
@Autowired
private int number;
@Autowired
private String version;
private String company;
private String strokes;

@Autowired
public Engine(String name, String type, String company) {
	super();
	this.name = name;
	this.type = type;
	this.company = company;
}


@Override
public String toString() {
	return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
			+ company + ", strokes=" + strokes + "]";
}


@Autowired
public void setStrokes(String strokes) {
	this.strokes = strokes;
}




}
