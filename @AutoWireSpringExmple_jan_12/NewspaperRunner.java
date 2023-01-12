package com.xworkz.springAutowirewithconst.boot;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowirewithconst.bean.NewsPaper;
import com.xworkz.springAutowirewithconst.configuration.NewspaperConfiguration;

public class NewspaperRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(NewspaperConfiguration.class);
		NewsPaper paper=container.getBean("newsPaper",NewsPaper.class);
		paper.setPrice(12.00);
		System.out.println(paper);
		
		NewsPaper paper2=container.getBean("vk",NewsPaper.class);
		System.out.println(paper2);
		
	}

}
