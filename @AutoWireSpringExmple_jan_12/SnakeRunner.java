package com.xworkz.springAutowirewithconst.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowirewithconst.bean.Snake;
import com.xworkz.springAutowirewithconst.configuration.SnakeConfiguration;

public class SnakeRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SnakeConfiguration.class);

		Snake havu=container.getBean("snake",Snake.class);
		System.out.println(havu);

		Snake havu2=container.getBean("sn",Snake.class);
		System.out.println(havu2);
	}


}
