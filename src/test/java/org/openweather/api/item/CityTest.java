package org.openweather.api.item;

import org.junit.Assert;
import org.junit.Test;

public class CityTest {
	
	@Test
	public void testCityByIdToURLString() {
		City city = new City(100500);
		Assert.assertEquals("id=100500", city.toURLString());
	}
	
	@Test
	public void testCityByNameToURLString() {
		City city = new City("London");
		Assert.assertEquals("q=London", city.toURLString());
	}
	
	@Test
	public void testCityByNameAndCountryCodeToURLString() {
		City city = new City("London", "ca");
		Assert.assertEquals("q=London,ca", city.toURLString());
	}

}
