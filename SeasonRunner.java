package com.xworkz.springbeans.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springbeans.beans.Season;
import com.xworkz.springbeans.configuration.SeasonConfiguration;

public class SeasonRunner {

	public static void main(String[] args) {

		ApplicationContext container3=new AnnotationConfigApplicationContext(SeasonConfiguration.class);
		Season refSeason=container3.getBean(Season.class);
		System.out.println(refSeason.getSname());
		System.out.println(refSeason.getStartMonth());
		System.out.println(refSeason.getDuration());
		
		
	}

}
