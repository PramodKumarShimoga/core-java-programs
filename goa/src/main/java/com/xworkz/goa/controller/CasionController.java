package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;
import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/casino")
public class CasionController {
	public CasionController() {
		System.out.println("Created: " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String  onBeach(CasinoDTO cdto,Model model)
	{
	    model.addAttribute("cname",cdto.getCname());
	    model.addAttribute("crname",cdto.getCrname());
	    
	    
	    model.addAttribute("cfee",cdto.getFees());
	    
	  
		return "casinoDisp.jsp";
	}

}
