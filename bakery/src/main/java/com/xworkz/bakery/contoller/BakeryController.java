package com.xworkz.bakery.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Component
@RequestMapping
public class BakeryController {
	@Autowired
	private BakeryService service;
	@PostMapping("/bake")
	public String onBakery(BakeryDTO b,Model m)
	{
		m.addAttribute("bname",b.getBakeryName());
		m.addAttribute("boname",b.getOwnerName());
		m.addAttribute("bwname",b.getWifeName());
		m.addAttribute("married",b.getMarried());
		m.addAttribute("famouse",b.getFamouseFor());
		m.addAttribute("since",b.getSince());
		boolean saved=this.service.validateAndSave(b);
		System.out.println("saved "+saved);
		
		return "disp.jsp";
	}
}
