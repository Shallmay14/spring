package com.example.demo.properties.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Properties {

	@Value( "${google.url}" )
	private String gooUrl;
}
