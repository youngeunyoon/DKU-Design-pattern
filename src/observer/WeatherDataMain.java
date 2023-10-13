package observer;

public class WeatherDataMain {
    public static void main(String[] args) {
        WeatherData dataSubject = new WeatherData();
        WeatherDataDisplayX myDisplay = new WeatherDataDisplayX(dataSubject);
        WeatherDataDisplayY yourDisplay = new WeatherDataDisplayY(dataSubject);

        dataSubject.addDisplay(myDisplay);
        dataSubject.addDisplay(yourDisplay);

        dataSubject.setHumidity(70);
        dataSubject.setPressure(750);
        dataSubject.setTemperature(23);

        dataSubject.notifyEverybody();

        dataSubject.setHumidity(80);

        dataSubject.notifyEverybody();

        dataSubject.setPressure(690);
        dataSubject.setTemperature(20);

        dataSubject.notifyEverybody();

//        myDisplay.display();
//        yourDisplay.display();
    }
}
