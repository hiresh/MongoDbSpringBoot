package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.service.PersonService;

@RestController
public class MainController {

	@Autowired
	PersonService personService;
	@GetMapping("/persons")
	public List<Person> getPersons(){
		return personService.getAll();
	}
	@GetMapping("/person")
	public String addP(@RequestParam String s,@RequestParam int a){
		return personService.addPerson(s,a);
	}
	
	@GetMapping("/")
	public String def(){
		return "test";
	}
	
}
