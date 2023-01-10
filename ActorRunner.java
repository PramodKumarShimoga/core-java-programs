package com.xworkz.springbeans.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springbeans.beans.Actor;
import com.xworkz.springbeans.configuration.ActorConfiguration;

public class ActorRunner {

	public static void main(String[] args) {
		ApplicationContext container2=new AnnotationConfigApplicationContext(ActorConfiguration.class);
		System.out.println("===============================================================================");
		Actor act=container2.getBean("actor",Actor.class);
		System.out.println(act.getName());
		System.out.println(act.getLang());
		System.out.println(act.getAge());
		System.out.println("===============================================================================");
	}

}
