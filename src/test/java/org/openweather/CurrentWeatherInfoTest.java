package org.openweather;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openweather.api.CurrentWeatherInfo;
import org.openweather.api.item.City;


public class CurrentWeatherInfoTest {
	
	@Test
	public void getCurrentWeatherTest() throws MalformedURLException {
		CurrentWeatherInfo cwi = new CurrentWeatherInfo(new City("London", "ca"));
		System.out.println(cwi.getWeather());
	}

}
