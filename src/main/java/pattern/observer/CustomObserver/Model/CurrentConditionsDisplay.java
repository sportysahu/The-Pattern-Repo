package pattern.observer.CustomObserver.Model;

import pattern.observer.CustomObserver.Model.interfaces.DisplayElement;
import pattern.observer.CustomObserver.Model.interfaces.Observer;
import pattern.observer.CustomObserver.Model.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        this.weatherData.registerObesrver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditions Display : temp "+temperature+" humidity :"+humidity+" pressure :"+pressure);
    }

    @Override
    public void update(float temprature, float humidity, float pressure) {
        this.temperature=temprature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
}
