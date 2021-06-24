package com.weather.weather.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.weather.weather.entity.weather;

public interface weatherdao extends JpaRepository<weather, String>{
	

}
