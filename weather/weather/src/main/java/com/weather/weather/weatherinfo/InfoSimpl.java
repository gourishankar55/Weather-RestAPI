package com.weather.weather.weatherinfo;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.weather.dao.WeatherDao;
import com.weather.weather.entity.Weather;

import jdk.javadoc.doclet.Taglet.Location;

@Service
public class InfoSimpl implements Infos {

	@Autowired
	private WeatherDao dao;
	//List<weather> list;
	public InfoSimpl()
	{

	
	}
	
	@Override
	public List<Weather> getWeather() {

		
		return dao.findAll();
	}


	

}
