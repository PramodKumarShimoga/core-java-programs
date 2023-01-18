package com.xworkz.springprojectdobject.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springprojectdobject.bean.Movie;
import com.xworkz.springprojectdobject.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println("#########################################################################");
		System.out.println("#########################################################################");
		Movie movie=container.getBean(Movie.class);
		System.out.println(movie);
		
		
		movie.movieInfo();
		
	
		

	}

}
