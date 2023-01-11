package com.xworkz.springAutowire.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowire.bean.Pencil;
import com.xworkz.springAutowire.bean.Rubber;
import com.xworkz.springAutowire.configuration.RubberConfiguration;

public class RubberRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(RubberConfiguration.class);
		Rubber s=container.getBean(Rubber.class);
		
		System.out.println(s);

	}

}
