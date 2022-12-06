package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.AppoloHospital;
import com.xworkz.hospitalapp.hospital.Patient;

public class ApploHospitalTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the size\n");
          int size = scanner.nextInt(); 
          AppoloHospital appoloHospital = new AppoloHospital(size);
          
          for(int i=0;i<size;i++)    
          {
        	  Patient patient = new Patient();  
        	  
	          System.out.println("Enter patient name  : \n");
	          patient.setName(scanner.next());	          
	          System.out.println("Enter patient age  :\n");
	          patient.setAge(scanner.nextInt());
	          
	          System.out.println("Enter the patient address :\n");
	          patient.setAddress(scanner.next());
	          
	          System.out.println("Enter the Gender :\n");
	         
	          patient.setGender(Gender.valueOf(scanner.next()));
          
	          appoloHospital.addPatient(patient); 
	          System.out.println();
          }
          appoloHospital.getAllPatient();
          System.out.println("enter the patient name to search");
          String pName=scanner.next();
          appoloHospital.getPatientByName(pName);
          
          System.out.println("enter the patient age to search");
          int page=scanner.nextInt();
          appoloHospital.getPatientByAge(page);
          
          
          System.out.println("enter the patient age to search");
          String str=scanner.next();
          appoloHospital.getPatientByAddress(str);
          
          System.out.println("enter the patient gender to search");
          String gen=scanner.next();
          appoloHospital.getPatientByGen(gen);
          
          System.out.println("enter the gender to search");
          String pname=scanner.next();
          appoloHospital.getGenByPatient(pname);
          
          
          
          
          
          scanner.close();
          
          
	}
}

// ariport = terminal[]
