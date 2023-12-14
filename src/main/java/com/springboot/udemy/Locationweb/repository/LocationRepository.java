package com.springboot.udemy.Locationweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.udemy.Locationweb.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
