package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;

@Component
@RequestMapping("/beach")
public class BeachController {
	public BeachController() {
		System.out.println("Created: " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String  onBeach(BeachDTO bdto,Model model)
	{
	    model.addAttribute("bname",bdto.getBname());
	    model.addAttribute("bloc",bdto.getBlocation());
	    
	    
	    model.addAttribute("bgames",bdto.getGames());
		return "beachDisp.jsp";
	}
}
