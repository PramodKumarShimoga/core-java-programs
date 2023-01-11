package com.xworkz.springAutowire.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowire.bean.Hardware;
import com.xworkz.springAutowire.configuration.HardwareConfiguration;



public class HardwareRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(HardwareConfiguration.class);
		Hardware h=container.getBean(Hardware.class);
		System.out.println(h);
		
		
		

	}

}
