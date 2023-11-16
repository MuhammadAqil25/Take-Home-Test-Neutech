package com.neutech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neutech.demo.entity.Membership;

@Repository
public interface MembershipRepository extends JpaRepository<Membership, String> {

}
