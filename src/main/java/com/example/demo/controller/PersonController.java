package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.rservice.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {
	
	Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	PersonService personService;

	@GetMapping("all/persons")
	public List<Person> findAll() {
		logger.info("logging contents --{}--",personService.findAll());
		return personService.findAll();
	}

}
