package com.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.model.*;
import java.util.*;
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView getIndex()
	{
		ModelAndView mymodelview=new ModelAndView("/index");
	    
		return mymodelview;
	}
	
	@RequestMapping("/pets")
	public ModelAndView getPets()
	{
		List<Pets> petlist=new ArrayList<Pets>();	
petlist.add(new Pets("Bosco","Dog",4));
petlist.add(new Pets("Kiwi","Cat",3));
petlist.add(new Pets("Shamaya","Car",3));
petlist.add(new Pets("Tomo","Dob",3));
petlist.add(new Pets("Erric","Parrot",4));
ModelAndView mymodelandview =new ModelAndView("/PetStoreHome");
	mymodelandview.addObject("petlist",petlist);
		return mymodelandview;
	}
	
	
	@RequestMapping("/addpet")
	public ModelAndView addpet()
	{
		ModelAndView addpetmodel=new ModelAndView("/AddPet");
		return addpetmodel;
	}
	
	
	@ModelAttribute("pets")
	public Pets getPet()
	{
		Pets pets=new Pets();
		pets.setPetName("No Name");
		pets.setType("no type");
		pets.setAge(1);
		return pets;
	}
	
	
	
	@RequestMapping(value="/addpetdetails",method=RequestMethod.POST)
	public ModelAndView addPetDetails(@ModelAttribute("pets")Pets pets)
	{
		
		
  		
  		ModelAndView view=new ModelAndView("/success");
  view.addObject("newpet",pets);
	 return view;
	
	}
	
	
	
	/*@RequestMapping(value="/addpetdetails",method=RequestMethod.POST)
	public ModelAndView addPetDetails(@RequestParam("petname")String petname,@RequestParam("age")int age
			,@RequestParam("pettype")String type,@RequestHeader HttpHeaders myheader )
	{
		
  		Pets pet=new Pets(petname,type,age);
  		ModelAndView mypet=new ModelAndView("/success");
  		mypet.addObject("newpet",pet);
  		System.out.println(myheader.getHost());
  		List<String> myconlist=myheader.getConnection();
  		for(String s:myconlist)
  		{
  			System.out.println(s);
  		}
  		return mypet;
  		
	}
	*/
	
	
}














