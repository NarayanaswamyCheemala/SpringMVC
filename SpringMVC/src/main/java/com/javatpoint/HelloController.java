package com.javatpoint;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.dao.UserDao;
import com.javatpoint.dao.exception.UserException;
import com.javatpoint.entity.User;


@Controller
public class HelloController {
	
	@Autowired
	UserDao dao;
	
@RequestMapping("/")
	public String display()
	{
		return "index";
	}	

@RequestMapping(value = "/register")
public String showRegister() {
  return "register";
}

@RequestMapping(value="/save",method = RequestMethod.POST)  
public String save(@ModelAttribute("usr") User usr) throws UserException{ 
 System.out.println("Controller login "+ usr);
 dao.save(usr);
	/*
	 * ModelAndView model = new ModelAndView("register"); model.addObject("msg",
	 * "Successfully added data");
	 */
 Map<String, Object> model= new HashMap<String, Object>();
 model.put("message", "Naray this is my first application");
    return "register";//will redirect to viewemp request mapping  
} 


}
