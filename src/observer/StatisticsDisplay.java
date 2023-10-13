package observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float highTemp = 0.0f;
    private float lowTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > highTemp) {
            highTemp = temperature;
        }

        if (temperature < lowTemp) {
            lowTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = " + (tempSum / numReadings) + "/" + highTemp + "/" + lowTemp);
    }
}
