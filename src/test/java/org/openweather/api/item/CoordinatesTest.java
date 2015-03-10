package org.openweather.api.item;

import org.junit.Assert;
import org.junit.Test;

public class CoordinatesTest {
	
	@Test
	public void testCityByIdToURLString() {
		Coordinates coordinates = new Coordinates(35, 0.8);
		Assert.assertEquals("lat=35.0&lon=0.8", coordinates.toURLString());
	}

}
