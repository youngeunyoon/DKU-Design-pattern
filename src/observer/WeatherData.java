package observer;

import java.util.ArrayList;

public class WeatherData {
	private ArrayList<WeatherDataDisplay> observers = new ArrayList<>();
	private float temperature;
	private float humidity;
	private float pressure;

	public void addDisplay(WeatherDataDisplay display) {
		this.observers.add(display);
	}

	public void notifyEverybody() {
		for(WeatherDataDisplay display: observers) {
			display.display();
		}
	}

	public void measurementsChanged() {
	}
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		measurementsChanged();
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
		measurementsChanged();
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		measurementsChanged();
	}
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
}
