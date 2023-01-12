package com.xworkz.springAutowirewithconst.boot;



import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowirewithconst.bean.Ghost;
import com.xworkz.springAutowirewithconst.configuration.GhostConfiguration;

public class GhostRunner {

	public static void main(String[] args) {

		ApplicationContext container=new AnnotationConfigApplicationContext(GhostConfiguration.class);
		Ghost gost=container.getBean(Ghost.class);
		System.out.println(gost);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
	}

}
