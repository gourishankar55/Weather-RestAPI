package com.weather.weather.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.weather.weather.entity.Weather;

public interface WeatherDao extends JpaRepository<Weather, String>{
	

}
