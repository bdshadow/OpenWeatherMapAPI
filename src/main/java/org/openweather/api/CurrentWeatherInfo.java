package org.openweather.api;

import org.openweather.api.base.WeatherInfoBase;
import org.openweather.api.item.Location;

public class CurrentWeatherInfo extends WeatherInfoBase {
	
	protected static String surl = "http://api.openweathermap.org/data/2.5/weather?";
	
	public CurrentWeatherInfo(Location location) {
		super(surl.concat(location.toURLString()));
	}
}
