package observer;

public class WeatherDataDisplayX implements WeatherDataDisplay {
    private WeatherData weatherData;

    public WeatherDataDisplayX(WeatherData data) {
        this.weatherData = data;
    }

    @Override
    public void display() {
        System.out.println(weatherData.getTemperature());
        System.out.println(weatherData.getHumidity());
        System.out.println(weatherData.getPressure());
    }
}
