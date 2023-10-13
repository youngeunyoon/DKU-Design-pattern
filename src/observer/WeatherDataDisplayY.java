package observer;

public class WeatherDataDisplayY implements WeatherDataDisplay {
    private WeatherData weatherData;

    public WeatherDataDisplayY(WeatherData data) {
        this.weatherData = data;
    }

    @Override
    public void display() {
        System.out.println("온도: " + weatherData.getTemperature());
        System.out.println("습도: " + weatherData.getHumidity());
        System.out.println("기압: " + weatherData.getPressure());
    }
}
