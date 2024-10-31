package com.devsuperior.dscommerce.controllers;

import com.devsuperior.dscommerce.dto.UserDTO;
import com.devsuperior.dscommerce.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(value = "/me")
	public ResponseEntity<UserDTO> getMe() {
		UserDTO dto = service.getMe();
		return ResponseEntity.ok(dto);
	}

}
