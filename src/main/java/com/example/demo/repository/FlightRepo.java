package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserIp;

@Repository
public interface FlightRepo extends CrudRepository<UserIp, Long> {

}