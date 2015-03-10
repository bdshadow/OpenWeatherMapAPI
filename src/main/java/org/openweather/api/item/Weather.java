package org.openweather.api.item;

public class Weather {
	
	protected Double temperature;
	
	protected Double humidity;
	
	protected Double temperatureMin;
	
	protected Double temperatureMax;
	
	protected Double pressure;
	
	protected Double pressureSeaLevel;
	
	protected Double pressureGrndLevel;
	
	protected Double windSpeed;
	
	protected Double windDegree;
	
	protected Double windGust;
	
	protected Double cloudiness;
	
	protected Double rainVolume;
	
	protected Double snowVolume;

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public Double getTemperatureMin() {
		return temperatureMin;
	}

	public void setTemperatureMin(Double temperatureMin) {
		this.temperatureMin = temperatureMin;
	}

	public Double getTemperatureMax() {
		return temperatureMax;
	}

	public void setTemperatureMax(Double temperatureMax) {
		this.temperatureMax = temperatureMax;
	}

	public Double getPressure() {
		return pressure;
	}

	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	public Double getPressureSeaLevel() {
		return pressureSeaLevel;
	}

	public void setPressureSeaLevel(Double pressureSeaLevel) {
		this.pressureSeaLevel = pressureSeaLevel;
	}

	public Double getPressureGrndLevel() {
		return pressureGrndLevel;
	}

	public void setPressureGrndLevel(Double pressureGrndLevel) {
		this.pressureGrndLevel = pressureGrndLevel;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Double getWindDegree() {
		return windDegree;
	}

	public void setWindDegree(Double windDegree) {
		this.windDegree = windDegree;
	}

	public Double getWindGust() {
		return windGust;
	}

	public void setWindGust(Double windGust) {
		this.windGust = windGust;
	}

	public Double getCloudiness() {
		return cloudiness;
	}

	public void setCloudiness(Double cloudiness) {
		this.cloudiness = cloudiness;
	}

	public Double getRainVolume() {
		return rainVolume;
	}

	public void setRainVolume(Double rainVolume) {
		this.rainVolume = rainVolume;
	}

	public Double getSnowVolume() {
		return snowVolume;
	}

	public void setSnowVolume(Double snowVolume) {
		this.snowVolume = snowVolume;
	}
	
	@Override
	public String toString() {
		return "Weather [temperature=" + temperature + ", humidity=" + humidity
				+ ", temperatureMin=" + temperatureMin + ", temperatureMax="
				+ temperatureMax + ", pressure=" + pressure
				+ ", pressureSeaLevel=" + pressureSeaLevel
				+ ", pressureGrndLevel=" + pressureGrndLevel + ", windSpeed="
				+ windSpeed + ", windDegree=" + windDegree + ", windGust="
				+ windGust + ", cloudPercentage=" + cloudiness
				+ ", rainVolume=" + rainVolume + ", snowVolume=" + snowVolume
				+ "]";
	}
}
