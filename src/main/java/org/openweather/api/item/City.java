package org.openweather.api.item;

import java.util.StringJoiner;

public class City implements Location {
	
	private int id = 0;
	
	private String name;
	
	private String countryCode;
	
	public City(int id) {
		this.id = id;
	}
	
	public City(String name) {
		this.name = name;
	}
	
	public City(String name, String countryCode) {
		this.name = name;
		this.countryCode = countryCode;
	}

	@Override
	public String toURLString() {
		if (id != 0) {
			return String.format("id=%s", id);
		}
		if (countryCode != null) {
			return String.format("q=%s,%s", name, countryCode);
		}
		return String.format("q=%s", name);
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCountryCode() {
		return countryCode;
	}
}
