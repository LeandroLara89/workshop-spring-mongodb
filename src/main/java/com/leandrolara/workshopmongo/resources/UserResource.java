package com.leandrolara.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leandrolara.workshopmongo.domain.User;
import com.leandrolara.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	//@GatMapping - pode usar essa escolha tb.
	public ResponseEntity< List<User>> findAll(){		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
