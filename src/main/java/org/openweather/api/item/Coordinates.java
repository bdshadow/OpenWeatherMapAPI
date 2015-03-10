package org.openweather.api.item;

public class Coordinates implements Location {
	
	private double latitude;
	
	private double longitude;
	
	public Coordinates(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public String toURLString() {
		return String.format("lat=%s&lon=%s", this.latitude, this.longitude);
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
