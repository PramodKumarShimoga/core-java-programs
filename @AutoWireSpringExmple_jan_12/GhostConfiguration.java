package com.xworkz.springAutowirewithconst.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAutowirewithconst")

public class GhostConfiguration {
	
	
	public GhostConfiguration() {
		System.out.println("<<<<<<<<Ghost class configured>>>>>>>>>");
	}
	
	
	
	@Bean
	public String gname() {
		return "mandakini";
	}



	@Bean
	public int gage() {
		return 23;
	}



	@Bean
	public char ggender() {
		return 'F';
	}



	@Bean
	public String gcolor() {
		return "white";
	}



	@Bean
	public double gnailsLength() {
		return 9.00;
	}



	@Bean
	public boolean glegs() {
		return false;
	}



	@Bean
	public String ghairColor() {
		return "white";
	}



	@Bean
	public String gtoungue() {
		return "longRed";
	}



	@Bean
	public String gteeth() {
		return "longKoreHallu";
	}



	@Bean
	public String gtype() {
		return "mohini";
	}



	@Bean
	public String greasonofDeath() {
		return "breakup";
	}



	@Bean
	public String grevenge() {
		return "Her Lover Sanjay";
	}



	@Bean
	public String gdeathPlace() {
		return "chikDevaraHalliTotadaMAne";
	}



	@Bean
	public String gfvrtFood() {
		return "LegPiece";
	}



	@Bean
	public String gghostFriend() {
		return "suchitra";
	}



	@Bean
	public String gteritory() {
		return "Thota....In....Mara";
	}



	@Bean
	public String gcountry() {
		return "Bharata";
	}



	@Bean
	public boolean gdangerous() {
		return true;
	}



	@Bean
	public String greligion() {
		return "HindhuLingayata";
	}



	@Bean
	public String gweakness() {
		return "emotionalPerson";
	}






	
	

}
