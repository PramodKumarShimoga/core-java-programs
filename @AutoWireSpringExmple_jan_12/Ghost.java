package com.xworkz.springAutowirewithconst.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Ghost {
	@Autowired
	private String gname;
	@Autowired
	private int gage;
	@Autowired
	private char ggender;
	@Autowired
	private String gcolor;
	@Autowired
	private double gnailsLength;
	@Autowired
	private boolean glegs;
	@Autowired
	private String ghairColor;
	@Autowired
	private String gtoungue;
	@Autowired
	private String gteeth;
	@Autowired
	private String gtype;
	
	
	
	
	private String greasonofDeath;
	private String grevenge;
	private String gdeathPlace;
	private String gfvrtFood;
	private String gghostFriend;
	private String gteritory;
	private String gcountry;
	private boolean gdangerous;
	private String greligion;
	private String gweakness;
	
	
	



	
	public Ghost(String greasonofDeath, String grevenge, String gdeathPlace, String gfvrtFood, String gghostFriend,
			String gteritory, String gcountry, boolean gdangerous, String greligion, String gweakness) {
		super();
		this.greasonofDeath = greasonofDeath;
		this.grevenge = grevenge;
		this.gdeathPlace = gdeathPlace;
		this.gfvrtFood = gfvrtFood;
		this.gghostFriend = gghostFriend;
		this.gteritory = gteritory;
		this.gcountry = gcountry;
		this.gdangerous = gdangerous;
		this.greligion = greligion;
		this.gweakness = gweakness;
	}







	@Override
	public String toString() {
		return "Ghost [gname=" + gname + ", gage=" + gage + ", ggender=" + ggender + ", gcolor=" + gcolor
				+ ", gnailsLength=" + gnailsLength + ", glegs=" + glegs + ", ghairColor=" + ghairColor + ", gtoungue="
				+ gtoungue + ", gteeth=" + gteeth + ", gtype=" + gtype + ", greasonofDeath=" + greasonofDeath
				+ ", grevenge=" + grevenge + ", gdeathPlace=" + gdeathPlace + ", gfvrtFood=" + gfvrtFood
				+ ", gghostFriend=" + gghostFriend + ", gteritory=" + gteritory + ", gcountry=" + gcountry
				+ ", gdangerous=" + gdangerous + ", greligion=" + greligion + ", gweakness=" + gweakness + "]";
	}







	




		
	

}
