package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.properties.bean.Properties;

@RestController
@RequestMapping(value = "/loadProperties")
public class WebController {
	
	@Autowired
	private Environment env;

	@Autowired
	private Properties useProperties;
	
	@RequestMapping(value = "/getGooUrl", method = RequestMethod.GET)
	@ResponseBody
	public String getGooUrl() {
		return useProperties.getGooUrl();
	}
	
	@RequestMapping(value = "/getEnvUrl", method = RequestMethod.GET)
	@ResponseBody
	public String getEnvUrl() {
		return env.getProperty("google.url");
	}

}
