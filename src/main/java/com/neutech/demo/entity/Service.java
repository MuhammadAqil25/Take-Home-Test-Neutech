package com.neutech.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "services")
public class Service {
	@Id
	private String id;
	
	@Column(name = "service_code")
	private String serviceCode;
	
	@Column(name = "service_name")
	private String serviceName;
	
	@Column(name = "service_icon")
	private String serviceIcon;
	
	@Column(name = "service_tarif")
	private String serviceTarif;
	
}
