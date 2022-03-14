package com.fulcrum.MvcDemo3;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {

	
	@RequestMapping("/hello")
//	public String display(HttpServletRequest req,Model m)
	public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model m)
   {
//		String name=req.getParameter("name");
//		String pass=req.getParameter("pass");
		
		if(pass.equals("admin"))
		{
			String msg= "Hello " +name;
			m.addAttribute("message", msg);  
			return "hello";
		}
		else {
			String msg="Sorry "+ name+". You entered an incorrect password";  
			m.addAttribute("message", msg);  
            return "Errorpage";  
		}
     }
	
}
