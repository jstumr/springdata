package com.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.model.Person;

@Service
public interface IPerson {
	public List<Person> getAll();
}
