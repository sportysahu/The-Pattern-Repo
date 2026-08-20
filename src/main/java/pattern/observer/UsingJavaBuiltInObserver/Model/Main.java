package pattern.observer.UsingJavaBuiltInObserver.Model;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,4.1f);
        weatherData.setMeasurements(70,55,4.1f);
        weatherData.setMeasurements(60,45,4.1f);

    }

}