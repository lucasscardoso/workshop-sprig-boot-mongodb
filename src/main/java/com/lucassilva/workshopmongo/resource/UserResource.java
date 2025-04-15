package com.lucassilva.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucassilva.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User lucas = new User ("1", "lucas silva", "lucas@gmail.com");
		User yuri = new User ("2", "Yuri cardoso", "yuri@gmail.com");
		List list = new ArrayList<>();
		list.addAll(Arrays.asList(lucas,yuri));
		return ResponseEntity.ok().body(list);
	}
}
