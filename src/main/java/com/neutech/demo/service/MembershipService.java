package com.neutech.demo.service;

import java.util.Set;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.neutech.demo.entity.Membership;
import com.neutech.demo.exception.ExceptionMassage;
import com.neutech.demo.model.RegisterMembershipRequest;
import com.neutech.demo.repository.MembershipRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

@Service
public class MembershipService {
	@Autowired
	private  MembershipRepository membershipRepository;
	
	@Autowired
	private Validator validator;
	
	@Transactional
	public void register(RegisterMembershipRequest request) {
		Set<ConstraintViolation<RegisterMembershipRequest>> constraintViolations = validator.validate(request);
		if(constraintViolations.size() != 0) {
			// error
			throw new ConstraintViolationException((Set<? extends javax.validation.ConstraintViolation<?>>) constraintViolations);
		}
		if(membershipRepository.existsById(request.getEmail())) {
			throw new ExceptionMassage("Email already register");
		}
		
		Membership membership = new Membership();
		membership.setEmail(request.getEmail());
		membership.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
		membership.setFirstName(request.getFirstName());
		membership.setLastName(request.getLastName());
		
		membershipRepository.save(membership);
	}
}
