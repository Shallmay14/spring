package com.example.demo.properties.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Properties {

	@Value( "${google.url}" )
	private String gooUrl;
}
