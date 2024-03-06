package com.probono.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.probono.demo.model.ProjectService;


@Controller 
public class ProjectController {
	

	@Autowired
	ProjectService projectService;

//	
//	@RequestMapping(path = "/activistAllView", method = RequestMethod.GET)
//	public ModelAndView activistAll() throws Exception {
//		System.out.println("---------");
//		
//		List<ActivistDTO> all = projectService.getAllActivists();
//		
//		//HttpServletRequest와 흡사한 기능의 객체
//		//데이터인 model 과 화면 view		
//		ModelAndView md = new ModelAndView();
//		
//		md.addObject("activistAll", all);//setAttribute("activistAll", all);
//		md.setViewName("activist/activistList");  //  /WEB-INF/activist/activistList.jsp
//
//		return md;//forward() 방식으로 jsp로 이동
//	}
	
	
	@ExceptionHandler
	public String exceptionHandler(Exception e, Model m) {
		m.addAttribute("errorMsg", "발생된 이슈 " + e.getMessage());
		e.printStackTrace();
		return "forward:showError.jsp";
	}
}
