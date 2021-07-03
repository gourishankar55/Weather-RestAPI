package com.weather.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weather.weather.entity.Weather;
import com.weather.weather.weatherinfo.Infos;
import com.weather.weather.weatherinfo.InfoSimpl;
import java.util.List;


@RestController
public class Controller {
    @Autowired
	private Infos infos;
	
@GetMapping("/weather") 
	public List<Weather> getWeather()
	{
		return this.infos.getWeather();
	}
	

}
