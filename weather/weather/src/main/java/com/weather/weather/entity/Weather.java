package com.weather.weather.entity;
//import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Weather {
	@Id
	private String date;
	private String time;
	private String location;
	private String temparature;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTemparature() {
		return temparature;
	}
	public void setTemparature(String temparature) {
		this.temparature = temparature;
	}
	public Weather(String date, String time, String location, String temparature) {
		super();
		this.date = date;
		this.time = time;
		this.location = location;
		this.temparature = temparature;
	}
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Weather [date=" + date + ", time=" + time + ", location=" + location + ", temparature=" + temparature
				+ "]";
	}
	

	
	
}
