package com.xworkz.springAutowire.boot;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowire.bean.Pencil;
import com.xworkz.springAutowire.configuration.PencilConfiguration;


public class PencilRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(PencilConfiguration.class);
		Pencil s=container.getBean(Pencil.class);
		
		System.out.println(s);
	}

}
