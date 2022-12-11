package com.xworkz.hospitalapp.hospital;
import com.xworkz.hospitalapp.constant.*;


public class AppoloHospital extends Hospital {
	
	
	public Patient[] patients;
	Patient[] newpatient;
    public int index ;
	
	public AppoloHospital(int size) {
		  patients = new Patient[size];
	}
	
	
	public boolean addPatient(Patient patient){
		boolean isPatientAdded = false;
		if(patient != null ) {
				System.out.println("Patient's details are Right go....\n ");
				patients[index++] = patient;
				isPatientAdded= true;
		}
				return isPatientAdded;
	}
	
	public void getAllPatient() {
		for(int i=0;i<patients.length;i++) {
		  System.out.println("Patient name : " +patients[i].getName()+"\n Patient address : "+patients[i].getAddress() +"\n patient age : "+patients[i].getAge()+ "\n Gender : "+patients[i].getGender()  );
		}
	}
	public void getPatientByAge(int age)
	{
		System.out.println("inside getPatientByAge");
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getAge()==age)
			{
				System.out.println(patients[i].getAge()+" "+patients[i].getAddress());
			}
			else {
				System.out.println("this age not found");
				break;
			}
		}	
	}
	public void getPatientByAddress(String  addr)
	{
		System.out.println("inside getPatientByAddress");
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getAddress().equals(addr))
			{
				System.out.println(patients[i].getName()+" "+patients[i].getAge());
			}
			else {
				System.out.println("this address not found");
				break;
			}
		}	
		
	}
	
	public boolean deletePatientbyName(String patientname)
	{
		boolean isDeleted=false;
	    newpatient=new Patient[patients.length -1];
	    for(int i=0,k=0;i<patients.length;i++)
	    {
	    	if(!patients[i].getName().equals(patientname))
	    	{
	    		newpatient[k]=patients[i];
	    		k++;
	    	}
	    	
	    }	
		
		return isDeleted;
	}
	
	
	
	public void getPatientByGen(String gen)
	{
	
		System.out.println("inside getPatientByGen");
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getGender()==Gender.valueOf(gen))
			{
				System.out.println(patients[i].getName()+" "+patients[i].getAddress());
			}
			else {
				System.out.println("this gender not found");
				break;
			}
		}
		
	}
	
	public void getGenByPatient(String pName)
	{
		System.out.println("inside getPatientByName");
		System.out.println("No of Parameters: 1 : patientName(String)");
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getName().equals(pName))
			{
				System.out.println(patients[i].getName()+" "+patients[i].getGender()+" ");
			}
			else {
				System.out.println("no Patient found");
				break;
			}
		}
	}
	public boolean updateAddressByName(String name,String newPatientAddress)
	{
		boolean isUpdated=false;
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getName().equals(name))
			{
				System.out.println("patient name matched...Proceed with  Updating address...... ");
				patients[i].setAddress(newPatientAddress);
			}
			else
			{
				System.out.println("Patient name not found");
				break;
			}
			
		}
		return isUpdated;	
	}
	
	
	
	
	public boolean updateAgeByName(String name,int agee)
	{
		boolean isUpdated=false;
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getName().equals(name))
			{
				System.out.println("patient name matched...Proceed with  Updating age...... ");
				patients[i].setAge(agee);
			}
			else
			{
				System.out.println("Patient name not found");
				break;
			}
			
		}
		return isUpdated;	
	}
	
	
	public void newgetAllPatient() {
		for(int i=0;i<newpatient.length;i++) {
		  System.out.println("Patient name : " +newpatient[i].getName()+"\n Patient address : "+newpatient[i].getAddress() +"\n patient age : "+newpatient[i].getAge()+ "\n Gender : "+newpatient[i].getGender()  );
		}
	}
	
	
	
	public void getPatientByName(String patientName)
	{
		System.out.println("inside getPatientByName");
		System.out.println("No of Parameters: 1 : patientName(String)");
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getName().equals(patientName))
			{
				System.out.println(patients[i].getAddress()+" "+patients[i].getAge()+" ");
			}
			else {
				System.out.println("no Patient found");
				break;
			}
		}
	}

}
