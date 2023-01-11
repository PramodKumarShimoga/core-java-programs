package com.xworkz.springAutowire.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowire.bean.Software;
import com.xworkz.springAutowire.configuration.SoftwareConfiguration;

public class SoftwareRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SoftwareConfiguration.class);
		String st[]=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(st));
		
		
		
		
		
		Software s=container.getBean(Software.class);
		
		System.out.println(s);
	}

}
