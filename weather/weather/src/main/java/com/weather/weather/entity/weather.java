package com.weather.weather.entity;
//import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class weather {
	@Id
	private String Date;
	private String Time;
	private String Location;
	private String Temparature;
	public weather(String date, String time, String location, String temparature) {
		super();
		Date = date;
		Time = time;
		Location = location;
		Temparature = temparature;
	}
	public weather() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getTemparature() {
		return Temparature;
	}
	public void setTemparature(String temparature) {
		Temparature = temparature;
	}
	@Override
	public String toString() {
		return "weather [Date=" + Date + ", Time=" + Time + ", Location=" + Location + ", Temparature=" + Temparature
				+ "]";
	}
	
	
	
	
}
