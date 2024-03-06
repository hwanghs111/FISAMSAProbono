package com.probono.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.probono.demo.model.UserService;
import com.probono.demo.model.dto.ActivistDTO;

@Controller 
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping(path = "/activistAllView", method = RequestMethod.GET)
	public ModelAndView activistAll() throws Exception {
		System.out.println("---------");
		
		List<ActivistDTO> all = userService.getAllActivists();
		
		ModelAndView md = new ModelAndView();
		
		md.addObject("activistAll", all);
		md.setViewName("activist/activistList"); 

		return md;
	}
	

	@ExceptionHandler
	public String exceptionHandler(Exception e, Model m) {
		m.addAttribute("errorMsg", "발생된 이슈 " + e.getMessage());
		e.printStackTrace();
		return "forward:showError.jsp";
	}
}
