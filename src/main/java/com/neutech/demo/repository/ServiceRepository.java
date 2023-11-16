package com.neutech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.neutech.demo.entity.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, String> {

}