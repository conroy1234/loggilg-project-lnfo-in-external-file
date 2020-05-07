package com.example.demo.rservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository pereosRepository;
	
	public List<Person> findAll(){
		return (List<Person>) pereosRepository.findAll();
	}
	
	public Person save(Person person) {
		return pereosRepository.save(person);
	}

}
