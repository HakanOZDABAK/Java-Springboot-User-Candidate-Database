package com.hakanozdabak.KayitSistemi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hakanozdabak.KayitSistemi.business.abstracts.UserService;
import com.hakanozdabak.KayitSistemi.core.utilities.Result;
import com.hakanozdabak.KayitSistemi.core.utilities.UserResult;
import com.hakanozdabak.KayitSistemi.entities.concretes.User;
import com.hakanozdabak.KayitSistemi.entities.dtos.UserDto;

@RestController
@RequestMapping(value ="/users")
@CrossOrigin
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping(value = "/getByUserEmail")
	public UserResult<User> getByUserEmail(@RequestParam String userEmail) {
	
		return this.userService.getByUserEmail(userEmail);
	}

    @PostMapping(value = "/add")
	public Result add(@RequestBody User user) {

		return this.userService.add(user);
	}
    
    @GetMapping(value = "/getByUserName")
    public UserResult<User> getByUserName(String userName){
		return this.userService.getByUserName(userName);
		
    }
    @GetMapping(value ="/getByUserNameDetails")
    public UserResult<List<UserDto>> getByUserNameDetails( ){
		return this.userService.getByUserNameDetails();
    }
    
    
    }
	

