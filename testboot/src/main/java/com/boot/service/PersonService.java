package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Person;
@Service
public class PersonService implements IPerson{
	
	@Autowired
	PersonRepo person;
	
	@Override
	public List<Person> getAll(){
		List<Person> persons = (List<Person>) person.findAll();
		return persons;
	}

}
