package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.PersonController;
import com.example.demo.model.Person;
import com.example.demo.rservice.PersonService;

@SpringBootApplication
public class LoggilgProjectLnfoInExternalFileApplication implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(LoggilgProjectLnfoInExternalFileApplication.class);
	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(LoggilgProjectLnfoInExternalFileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Person> persons = Arrays.asList(
				new Person("conroy", " white", "32 marstan avenue", "conroyaw@gmail.com", "079320145678"),
				new Person("timothy", " white", "florida", "timothyTw@gmail.com", "079320145462"),
				new Person("victor", " white", "wembley", "victyoraw@gmail.com", "0793207894"),
				new Person("Stephen", " white", "luton", "stephen@gmail.com", "0793207890"),
				new Person("louise", " blackwood", "watford", "louise@gmail.com", "079320146398"),
				new Person("carol", " wjohnson", "mandevill Jamaicca", "carol@gmail.com", "079320147418"),
				new Person("delroy", " white", "leicester", "delroy@gmail.com", "079320142589"),
				new Person("alin", " just", "new york", "alvin@gmail.com", "079320142369"),
				new Person("fitzroy", " white", "edgware", "fitzroy@gmail.com", "079320148794"));

		persons.forEach(person -> {
			logger.info(person.toString(),"has saved");
			personService.save(person);
			
		});

	}

}
