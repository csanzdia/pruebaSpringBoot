package com.example.controllerRest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bean.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@RequestMapping("/getUser")
	public User getUser (@RequestParam (value ="name") String nameU, @RequestParam(value="lastName") String lastNameU){
		
		User userNew = new User(nameU, lastNameU);
		return userNew;
	}
	
}
