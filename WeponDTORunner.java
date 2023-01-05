package com.xworkz.weponDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.weponDTO.wepon.Type;
import com.xworkz.weponDTO.wepon.WeponDTO;

public class WeponDTORunner {

	public static void main(String[] args) {

		WeponDTO dto=new WeponDTO("pistolAuto 9mm 1A","INDIA",LocalDate.of(1996, 05, 12),854512,Type.valueOf("PISTOL"));
		WeponDTO dto1=new WeponDTO("glock","AUS",LocalDate.of(1991, 02, 22),7856422,Type.SHORT_GUN);
		WeponDTO dto2=new WeponDTO("12 bore PAG","INDIA",LocalDate.of(1992, 07, 02),554512,Type.ASSAULT_RIFLE);
		
		WeponDTO dto3=new WeponDTO("heckler and koch MP5","GERMANY",LocalDate.of(1996, 05, 12),25000,Type.MACHINE_GUN);		
		WeponDTO dto4=new WeponDTO("micro-UZI","ISREL",LocalDate.of(1991, 04, 11),3900.3,Type.SNIPPER_RIFLE);
		WeponDTO dto5=new WeponDTO("saf carbine 2a1","INDIA AND UK",LocalDate.of(1997, 12, 12),7654.9,Type.PISTOL);
		WeponDTO dto20=new WeponDTO("1b1 insas","INDIA",LocalDate.of(1990, 02, 12),25000,Type.MACHINE_GUN);
		
		WeponDTO dto6=new WeponDTO("sig-716i","US",LocalDate.of(1996, 01, 11),35003,Type.MACHINE_GUN);
		WeponDTO dto7=new WeponDTO("ak-203","INDIA  AND RUSSIA",LocalDate.of(1998, 05, 07),2121,Type.SUBMCHINE_GUN);
		WeponDTO dto8=new WeponDTO("imi tavor","ISREL",LocalDate.of(1989, 05, 27),5454.4,Type.PISTOL);
		
		WeponDTO dto9=new WeponDTO("m4a1","US",LocalDate.of(1990, 12, 07),43211.1,Type.SUBMCHINE_GUN);
		WeponDTO dto10=new WeponDTO("t91 assalt rifle","TAIWAN",LocalDate.of(19994, 06, 28),54322.2,Type.SHORT_GUN);
		WeponDTO dto11=new WeponDTO("fn scar l","BELGIUM",LocalDate.of(1996, 05, 19),9876.2,Type.SNIPPER_RIFLE);
		
		WeponDTO dto12=new WeponDTO("akm","SU",LocalDate.of(1999, 02, 25),854512,Type.PISTOL);
		WeponDTO dto13=new WeponDTO("dragunov svd","INDIA AND SU",LocalDate.of(2000, 05, 12),76543,Type.ASSAULT_RIFLE);
		WeponDTO dto14=new WeponDTO("steyr ssg 69","AUS",LocalDate.of(1999, 10, 25),54323.3,Type.SNIPPER_RIFLE);
		WeponDTO dto15=new WeponDTO("imi 7.62","ISREL",LocalDate.of(1993, 07, 19),33333.2,Type.HAND_GUN);
		
		WeponDTO dto16=new WeponDTO("heckler and koch psg1","GERMANY",LocalDate.of(1989, 06, 27),54334,Type.PISTOL);
		WeponDTO dto17=new WeponDTO("sako trg","FINLAND",LocalDate.of(1990, 03, 10),45454,Type.SNIPPER_RIFLE);
		WeponDTO dto18=new WeponDTO("mauser sp66","GERMANY",LocalDate.of(1991, 12, 03),1111,Type.SUBMCHINE_GUN);
		WeponDTO dto19=new WeponDTO("tikka t3","FINELAND",LocalDate.of(1995, 04, 04),98774.2,Type.SHORT_GUN);
				
		Collection<WeponDTO> wc=new ArrayList();
		
		
		wc.add(dto);wc.add(dto2);wc.add(dto4);wc.add(dto6);wc.add(dto8);wc.add(dto10);wc.add(dto12);wc.add(dto13);wc.add(dto14);wc.add(dto15);wc.add(dto16);wc.add(dto17);wc.add(dto18);
		wc.add(dto1);wc.add(dto3);wc.add(dto5);wc.add(dto7);wc.add(dto9);wc.add(dto11);wc.add(dto19);wc.add(dto20);
		
		
		System.out.println("==========================================================================================================");
		for(WeponDTO dt:wc )
		{
			System.out.println(dt);
		}
		
		
		System.out.println("==========================================================================================================");
		System.out.println("============================FIND ALL THE WEAPONS BY PRICE GREATERTHEN 25000===============================");
		
		wc.stream().filter((a)->a.getPrice()>25000)
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
		System.out.println("==========================================================================================================");
		System.out.println("====================================PRINT ALL THE WEPON MADEBY ON MadeON==================================");
		wc.stream().forEach(e->System.out.println("Name: "+e.getName()+"\nMadeBy: "+e.getMadeby()+"\nMadeOn: "+e.getMadeon()+"\n\n"));
		
		System.out.println("==========================================================================================================");
		System.out.println("===============================PRINT WEPON BY NAME SORTED IN DESC======================================== ");
		wc.stream()
		.sorted((a,b)->b.getName().compareTo(a.getName()))
		.forEach(a->System.out.println(a));
		
		System.out.println("==========================================================================================================");
	    System.out.println("=======================================PRINT WEAPON SOTED BY MADEBY=======================================");
	    wc.stream()
		.sorted((a,b)->a.getMadeby().compareTo(b.getMadeby()))
		.forEach(a->System.out.println(a));
		
		System.out.println("==========================================================================================================");
		System.out.println("=======================================PRINT WEAPON SOTED BY MADEON=======================================");
		 wc.stream()
			.sorted((a,b)->a.getMadeon().compareTo(b.getMadeon()))
			.forEach(a->System.out.println(a));
		
		System.out.println("==========================================================================================================");
		System.out.println("=================================SORT BY PRICE ASC========================================================");
		wc.stream().sorted((a,b)->Double.compare(a.getPrice(),b.getPrice()))
				.forEach(a->System.out.println(a));
		System.out.println("==========================================================================================================");
		System.out.println("=================================SORT BY PRICE DESC=======================================================");
		wc.stream().sorted((a,b)->Double.compare(b.getPrice(),a.getPrice()))
				.forEach(a->System.out.println(a));
		System.out.println("=================================SORT BY NAME AND MADE ON ASC==============================================");
		Comparator<WeponDTO> comName=(a,b)->a.getName().compareTo(b.getName());
		Comparator<WeponDTO> comMadeon=(a,b)->a.getMadeon().compareTo(b.getMadeon());
		List<WeponDTO> sortmadeon=wc.stream().sorted(comMadeon).collect(Collectors.toList());
		List<WeponDTO> sortName=wc.stream().sorted(comName).collect(Collectors.toList());
		System.out.println("Name: \n"+sortName);
		System.out.println(" MadeOn:\n"+sortmadeon);
		
		
		
		System.out.println("==========================================================================================================");
		System.out.println("=================================Print weapon sort by type and madeby=====================================");
		Comparator<WeponDTO> comMadeby=(a,b)->a.getMadeby().compareTo(b.getMadeby());
		Comparator<WeponDTO> comType=(a,b)->a.getType().compareTo(b.getType());
		List<WeponDTO> sortmadeby=wc.stream().sorted(comMadeon).collect(Collectors.toList());
		List<WeponDTO> sorttype=wc.stream().sorted(comName).collect(Collectors.toList());
		System.out.println("Name: \n"+sortmadeby);
		System.out.println(" MadeOn:\n"+sorttype);
		
		
		
		System.out.println("==========================================================================================================");
		System.out.println("==========================================================================================================");
		
		
	}

}
