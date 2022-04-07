package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.model.Item;
import java.util.ArrayList;
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String getIndex()
	{
		return "/index";
	}
	
	@RequestMapping("/home")
	public ModelAndView getHome()
	{
		
		ModelAndView view=new ModelAndView("/home");
		
		ArrayList itemList=new ArrayList();
		itemList.add(new Item("Coffee",20,200));
		itemList.add(new Item("Tea",25,300));
		itemList.add(new Item("Espresso",35,100));
		
		  
		  view.addObject("itemlist",itemList); 
		   
		return view;
	}
	
	
	/*
	@RequestMapping(value="/additem", method=RequestMethod.POST)
	
public ModelAndView additem(@RequestParam("itemname") String itemname,@RequestParam("price") float price,@RequestParam("quantity")int quantity)
	
	{
	
		  Item item=new Item(itemname,price,quantity);
		  ModelAndView view=new ModelAndView("/success");
		  view.addObject("item",item);
		  
		  return view;
		
	}
	*/
	
	
	
	@ModelAttribute("itemattribute")
	public Item getItem()
	{
		Item item=new Item("Coffee",20,10);
		return item;
	}
	
	
	@RequestMapping(value="/additem" ,method=RequestMethod.POST)
   public ModelAndView addItem(@RequestBody @ModelAttribute("itemattribute") Item item)
   {
	
		   ModelAndView view=new ModelAndView("/success");
		   view.addObject("item",item);
		   return view;
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/item/{itemName}")
	public ModelAndView getItemByName(@PathVariable("itemName") String itemname)
	{
		
ModelAndView view=new ModelAndView("/itembyname");
		
		ArrayList<Item> itemList=new ArrayList();
		itemList.add(new Item("Coffee",20,200));
		itemList.add(new Item("Tea",25,300));
		itemList.add(new Item("Espresso",35,100));
		
		for(Item i:itemList)
		{
			
			if(i.getItemName().equals(itemname))
			{
				view.addObject("item",i);
			}
			
		}
		
		
		
		
		return view;
	}
	
	
	
	
	
	
	
	
	
	
	

}
