package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Item;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String getIndex()
	{
		return "/index";
	}

	@ModelAttribute("frmitem")
	public Item getItem()
	{
		return new Item();
	}
	
}
