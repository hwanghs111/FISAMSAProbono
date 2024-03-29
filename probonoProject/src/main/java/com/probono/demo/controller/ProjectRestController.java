package com.probono.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.probono.demo.model.ProjectService;
import com.probono.demo.model.dto.ProbonoProjectDTO;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class ProjectRestController {

	@Autowired
	ProjectService probonoService;

	//http://ip:port/context/path
	//http://127.0.0.1:80/probono/probonoProjectAll
	// 모든 ProbonoProject 검색 메소드
	@GetMapping("/probonoProjectAll")
	public List<ProbonoProjectDTO> probonoProjectAll() throws Exception {
		return probonoService.getAllProbonoProjects();
	}
	
}
