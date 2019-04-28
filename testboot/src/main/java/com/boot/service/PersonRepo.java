package com.boot.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.model.Person;


@Repository
public interface PersonRepo extends CrudRepository<Person,Long> {

}
