package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	@GetMapping("hello")
	public ModelAndView hello()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("show");
		mv.addObject("key","hello world");
		
		return mv;
	}

}
