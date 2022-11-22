package com.xworkz.engineerApp.csengineer;

import com.xworkz.engineerApp.engineer.Engineer;

public class CsEngineer extends Engineer{
	
	@Override
	public String solveProblems()
	{
		return "Solving Problems by Csengineer"; 
	}
	
	public void buildSoftware() {
		System.out.println("creating big softwares");
	}

}
