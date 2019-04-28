package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Person;
import com.example.repo.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repo;
	
	public Person getByName(String s){
		return repo.findByName(s);
	}
	
	public List<Person> getAll(){
		return repo.findAll();
	}
	
	public String addPerson(String n,int a){
		return repo.save(new Person(n,a)).getName();
		
	}
}
