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
@Table(name = "banners")
public class Banner {
	@Id
	private String id;
	
	@Column(name = "banner_name")
	private String bannerName;
	
	@Column(name = "banner_image")
	private String bannerImage;
	
	@Column(name = "description")
	private String description;
}
