package pattern.observer.UsingJavaBuiltInObserver.Model;

import pattern.observer.CustomObserver.Model.interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temprature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);

    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temprature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            this.pressure=weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("CurrentConditions Display from Java observer : temp "+ temprature +" humidity :"+humidity+" pressure :"+pressure);
    }
}
