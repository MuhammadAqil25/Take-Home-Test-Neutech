package com.neutech.democontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neutech.demo.model.RegisterMembershipRequest;
import com.neutech.demo.model.WebResponse;
import com.neutech.demo.service.MembershipService;

@RestController
public class MembershipController {
	
	@Autowired
	private MembershipService membershipService;
	
	@PostMapping(
			path = "/registration",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public WebResponse<String> register(@RequestBody RegisterMembershipRequest request){
		membershipService.register(request);
		return WebResponse<String>
		
	}
}
