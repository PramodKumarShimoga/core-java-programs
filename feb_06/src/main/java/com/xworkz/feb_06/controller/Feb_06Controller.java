package com.xworkz.feb_06.controller;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Component
@RequestMapping("/")
public class Feb_06Controller {
	public Feb_06Controller() {
		System.out.println("Created : Congtroller COnst");
	}

	@GetMapping("/mail")
	public String onEmail(Model m) {
		String em = " pramodkumara.xworkz@gamil.com";
		m.addAttribute("email", em);
		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onMobile(Model mm) {
		long mnum = 7204971015L;
		mm.addAttribute("mobilem", mnum);
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model mm) {
		mm.addAttribute("age", 25);
		return "index.jsp";
	}

	@GetMapping("/adr")
	public String onAadhar(Model mm) {
		mm.addAttribute("aadhar", 673934356789L);
		return "index.jsp";
	}

	@GetMapping("/dob")
	public String onDateOf(Model mm) {
		mm.addAttribute("dob", "18-Jun-1997 6.45Am");
		return "index.jsp";
	}

	@GetMapping("/sallary")
	public String onDesiredSal(Model mm) {
		mm.addAttribute("sall", "4lpa");
		System.out.println("Running Sallary");
		return "index.jsp";
	}

	@GetMapping("/bestfrnds")
	public String onBestFrnds(Model mm) {
		List<String> bff = new ArrayList<String>();
		bff.add("Manohara");
		bff.add("Sanjana");
		bff.add("Sanjay");
		bff.add("Sagar");
		bff.add("Suchitra");
		System.out.println("Running Best Frinends");
		mm.addAttribute("best", bff);
		return "index.jsp";
	}

	@GetMapping("/visitedPlace")
	public String onVisitedPalce(Model mm) {
		List<String> vp = new ArrayList<String>();
		vp.add("Shimogga");
		vp.add("thirthahalli");
		vp.add("agumbe");
		vp.add("sringeri");
		
		vp.add("sagara");
		vp.add("siganduru");
		System.out.println("Running Visited Place+");
		mm.addAttribute("vistedp", vp);
		return "index.jsp";
	}

	@GetMapping("/listOfSkill")
	public String onListOfSkill(Model mm) {
		List<String> sk = new ArrayList<String>();
		sk.add("Java");
		sk.add("JavaScript");
		sk.add(" HTML");
		sk.add("SQL");
		sk.add("Servlet");
		sk.add("Spring");
		sk.add("JSP");
		System.out.println("Running Skill Set");
		mm.addAttribute("skill", sk);
		return "index.jsp";
	}

	@GetMapping("/edu")
	public String onEducation(Model mm) {

		 com.xworkz.feb_06.dto.EducationDTO dto = new com.xworkz.feb_06.dto.EducationDTO();

		dto.setName("PramodKumara M");
		dto.setStandard("MCA");
		dto.setSection("A");
		dto.setTotSubjects(6);
		dto.setSub1("Data Analytics Using Python");
		dto.setSub2("Research Methodlogy");
		dto.setSub3("Internet of things");
		dto.setSub4("Java, JavaServlet");
		dto.setSub5("ADO .Net");
		dto.setSub6("PHP");

		mm.addAttribute("eduDto", dto);
		System.out.println("Running education Dto zhyjn");
		return "index.jsp";
	}

	@GetMapping("/mob")
	public String onMobil(Model mm) {
		com.xworkz.feb_06.dto.MobilDto dto = new com.xworkz.feb_06.dto.MobilDto();
		dto.setName("OPPO f1");
		dto.setModel("Android10");
		dto.setPrice(16000);
		dto.setDispSize("6.5 inch");
		dto.setRam("4 GB Ram");	
		mm.addAttribute("mobi", dto);		
		System.out.println("Running Mobile Dto ");
		return "index.jsp";
	}
	
	@GetMapping("/bev")
	public String onBev(Model mm) {
		
		com.xworkz.feb_06.dto.BevrageDTO dto = new com.xworkz.feb_06.dto.BevrageDTO();
		dto.setName("REDBULL");
		dto.setId(1);
		dto.setQuantity("4");
		dto.setPrice(600);
		dto.setBarcodeNo("jyf63bc67437");
		dto.setColour("white");
		dto.setFlavour("mint");
		dto.setType("enargydrink");
		dto.setMfdDate(LocalDate.of(2023,1,12));
		dto.setExpDate(LocalDate.of(2024, 2,03));
		mm.addAttribute("bev", dto);		
		System.out.println("Running BEvrage Dto ");
		return "index.jsp";
	}
	
	@GetMapping("/chat")
	public String onChat(Model mm) {
		com.xworkz.feb_06.dto.ChatDTO dto= new com.xworkz.feb_06.dto.ChatDTO();
		
		dto.setName("BangarPet Chats");
		dto.setId(1);
		dto.setLocation("Bashyam Circle");
		dto.setPrice(35);
		dto.setChat1("Pani puri");
		dto.setChat2("Dhai puri");
		dto.setChat3("Gobi Manchurian");
		dto.setChat4("nipat masal");
		dto.setChat5("Sev Puri");
		dto.setChat6("Masal Puri");
		
		mm.addAttribute("chat", dto);		
		System.out.println("Running chat Dto ");
		return "index.jsp";
	}

}
