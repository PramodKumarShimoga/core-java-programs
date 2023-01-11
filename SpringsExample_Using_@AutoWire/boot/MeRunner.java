package com.xworkz.springAutowire.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowire.bean.Me;
import com.xworkz.springAutowire.bean.Rubber;
import com.xworkz.springAutowire.configuration.MeConfiguration;


public class MeRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(MeConfiguration.class);
		Me s=container.getBean(Me.class);
		
		System.out.println(s);

	}

}
