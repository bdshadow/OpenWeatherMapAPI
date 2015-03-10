package org.openweather.api.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.openweather.api.item.Weather;

import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public abstract class WeatherInfoBase {
	
	protected URL url;
	
	protected WeatherInfoBase(String surl) {
		try {
			this.url = new URL(surl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	protected String readURL() {
		StringBuilder json = new StringBuilder();
		try (BufferedReader in = new BufferedReader(new InputStreamReader(
				this.url.openStream()))) {
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				json.append(inputLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json.toString();
	}
	
	public Weather getWeather() {
		Weather weather = new Weather();
		JsonObject weatherJSON = JsonObject.readFrom(readURL());
		
		JsonObject weatherMain = weatherJSON.get("main").asObject();
		weather.setTemperature(getJsonDoubleValue(weatherMain, "temp"));
		weather.setHumidity(getJsonDoubleValue(weatherMain, "humidity"));
		weather.setTemperatureMin(getJsonDoubleValue(weatherMain, "temp_min"));
		weather.setTemperatureMax(getJsonDoubleValue(weatherMain, "temp_max"));
		weather.setPressure(getJsonDoubleValue(weatherMain, "pressure"));
		weather.setPressureSeaLevel(getJsonDoubleValue(weatherMain, "sea_level"));
		weather.setPressureGrndLevel(getJsonDoubleValue(weatherMain, "grnd_level"));
		
		if (weatherJSON.get("wind") != null) {
			JsonObject weatherWind = weatherJSON.get("wind").asObject();
			weather.setWindSpeed(getJsonDoubleValue(weatherWind, "speed"));
			weather.setWindDegree(getJsonDoubleValue(weatherWind, "deg"));
			weather.setWindGust(getJsonDoubleValue(weatherWind, "gust"));
		}
		
		weather.setCloudiness(getJsonDoubleValue(weatherJSON.get("clouds"), "all"));
		weather.setRainVolume(getJsonDoubleValue(weatherJSON.get("rain"), "3h"));
		weather.setSnowVolume(getJsonDoubleValue(weatherJSON.get("snow"), "3h"));
		
		return weather;
	}
	
	protected Double getJsonDoubleValue(JsonValue object, String valueName) {
		if (object != null) {
			return getJsonDoubleValue(object.asObject(), valueName);
		}
		return null;
	}
	
	protected Double getJsonDoubleValue(JsonObject object, String valueName) {
		JsonValue value = object.get(valueName);
		if (value != null) {
			return value.asDouble();
		}
		return null;
	}
}
