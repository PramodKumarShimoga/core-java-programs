package com.xworkz.springAutowirewithconst.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowirewithconst.bean.Engine;
import com.xworkz.springAutowirewithconst.configuration.EngineConfiguration;

public class EngineRunner {


	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(EngineConfiguration.class);
		Engine eng=container.getBean("engine",Engine.class);
		System.out.println(eng);
		Engine eng1=container.getBean("en",Engine.class);
		System.out.println(eng1);
	}
}
