package com.weather.weather.weatherinfo;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.weather.dao.weatherdao;
import com.weather.weather.entity.weather;

import jdk.javadoc.doclet.Taglet.Location;

@Service
public class infosimpl implements infos {

	@Autowired
	private weatherdao dao;
	//List<weather> list;
	public infosimpl()
	{

		
	}
	
	@Override
	public List<weather> getweather() {

		
		return dao.findAll();
	}


	

}
