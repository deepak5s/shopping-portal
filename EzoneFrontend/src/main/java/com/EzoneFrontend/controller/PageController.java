package com.EzoneFrontend.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView  mv= new ModelAndView ("page");
		mv.addObject("greeting","spring Mvc");
		return mv;
		
	}
		@RequestMapping(value={"/about"})

		public ModelAndView about(){

			ModelAndView mv=new ModelAndView("page");

			mv.addObject("title", "Aboutus");

			mv.addObject("userClickAbout", true);

			return mv;

			

		}

		@RequestMapping(value={"/contact"})

		public ModelAndView contact(){

			ModelAndView mv=new ModelAndView("page");

			mv.addObject("title", "Contactus");

			mv.addObject("userClickContact", true);

			return mv;

		}



		}