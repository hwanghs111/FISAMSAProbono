package com.probono.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.probono.demo.model.UserService;
import com.probono.demo.model.dto.ActivistDTO;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserRestController {

	@Autowired
	UserService userService;


	@GetMapping("/activistAll")
	public List<ActivistDTO> activistAll() throws Exception {
		return userService.getAllActivists();
	}

	@GetMapping("/activist")
	public ActivistDTO activist(@RequestParam("id") String activistId) throws Exception {
		return userService.getActivist(activistId); 
	}

	@PostMapping("/activistInsert")
	protected String activistInsert(ActivistDTO activist) throws Exception {
		boolean result = userService.addActivist(activist);
		return result ? "기부자 가입 완료" : "가입실패";
	}

}
