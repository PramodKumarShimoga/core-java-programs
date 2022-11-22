package com.xworkz.engineerApp;

import com.xworkz.engineerApp.csengineer.CsEngineer;
import com.xworkz.engineerApp.ecengineer.EcEngineer;
import com.xworkz.engineerApp.engineer.Engineer;

public class EngineerTester {

	public static void main(String[] args) {
		//Polymorphism --- or ---- implicit casting
		EcEngineer ec=new EcEngineer();
		System.out.println(ec.solveProblems());
		
		//Casting
		
		Engineer eng=new CsEngineer();
		eng.solveProblems() ; 
		
		//explicit casting
		CsEngineer cs= (CsEngineer)eng;
		System.out.println(cs.solveProblems());
		
	}

}
