package com.clothingcloset.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clothingcloset.api.Login;
import com.clothingcloset.models.Person;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	Login login;
	
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	   public ModelAndView person() {
	      return new ModelAndView("person", "command", new Person());
	   }
	
	@RequestMapping(value= "/registration",method=RequestMethod.POST)
	public String registerPerson(@ModelAttribute("SpringWeb")Person person, 
			   ModelMap model){
		
		boolean isRegistered= login.registerPerson(person);
		
		if(isRegistered){
			System.out.println("Registration for the person is successful.");
		}else{
			System.out.println("Registration was not successful.");
		}
		
		return "result";
		
	}
}
