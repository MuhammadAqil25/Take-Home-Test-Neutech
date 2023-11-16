package com.neutech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neutech.demo.entity.Banner;

@Repository
public interface BannerRepository extends JpaRepository<Banner, String> {

}
