package com.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Person;
import com.boot.service.IPerson;

@RestController
public class DempController {
	@Autowired
	IPerson pService;

	@GetMapping("/all")
	public List<Person> getAll() {
		Person p1 = new Person();
		p1.setPartnerid(33L);
		p1.setFirstname("uamr");
		p1.setLastname("akram");
		
		Person p2 = new Person();
		p2.setPartnerid(3L);
		p2.setFirstname("ruma");
		p2.setLastname("rana");
		
		List<Person> persons = pService.getAll();   //new ArrayList<Person>();
		//persons.add(p1);
		//persons.add(p2);
		
		return persons;
	}
	
}
