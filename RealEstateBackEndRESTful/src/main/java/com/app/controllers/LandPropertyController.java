package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.ILandProperty;
import com.app.pojos.LandProperty;
import com.app.service.ILandPropertyService;

@RestController
@RequestMapping("/LandProperty")
public class LandPropertyController {
	
	//D.I
	@Autowired
	private ILandPropertyService propertyService;
	
	public LandPropertyController() {
		System.out.println("in ctrl of "+getClass().getName());
	}
	
	@GetMapping("/city/{cityName}")
	public List<LandProperty> LandPropertyByCity(@PathVariable String cityName) {
		return propertyService.fetchPropertyByCity(cityName);
	}
	
}
