package com.weather.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weather.weather.entity.weather;
import com.weather.weather.weatherinfo.infos;
import com.weather.weather.weatherinfo.infosimpl;
import java.util.List;



@RestController
public class Controller {
    @Autowired
	private infos Infos;
	
@GetMapping("/weather") 
	public List<weather> getweather()
	{
		return this.Infos.getweather();
	}
	

}
