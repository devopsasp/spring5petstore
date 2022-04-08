package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.ItemService;
import com.model.Item;

@Controller
public class ItemCrudController {
	
	@Autowired
	ItemService service;
	
	@ModelAttribute("frmitem")
	public Item getItem()
	{
		return new Item();
	}
	
	@RequestMapping(value="/additem",method=RequestMethod.POST)
	public ModelAndView addItem(@RequestBody @ModelAttribute("frmitem")Item item)
	{
		service.add(item);
		ModelAndView view=new ModelAndView("/success");
		view.addObject("item",item);
		return view;
	}
	
	@RequestMapping("/viewallitems")
	public ModelAndView viewallitems()
	{
		List<Item> itemlist=service.findAll();
		
		ModelAndView view=new ModelAndView("/itemlist");
		
		view.addObject("itemlist",itemlist);
		
		return view;
		
		
	}
	

	
	
	
	
	
	
	
	
}
