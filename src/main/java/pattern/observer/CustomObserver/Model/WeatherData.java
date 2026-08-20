package pattern.observer.CustomObserver.Model;


import pattern.observer.CustomObserver.Model.interfaces.Observer;
import pattern.observer.CustomObserver.Model.interfaces.Subject;

import java.util.ArrayList;

public class WeatherData  implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObesrver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if (i>0)
            observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers)
            o.update(temperature,humidity,pressure);
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity , float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }


    /*
     // classic class with problems
    public class WeatherData{

    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature(){
        return this.temperature;
    }
    public float getHumidity(){
        return this.humidity;
    }
    public float getPressure(){
        return this.pressure;
    }

    // as per the spec calling this method would upater the values in the 3 displays
    public void measurementsChanged(){

        float temp = getTemperature();
        float humi= getHumidity();
        float press = getPressure();

        //currentConditionsDisplay(temp,humi,press);
        // forecastDisplay(temp,humi,press);
        // statistical  Display(temp,humi,press);

    }*/


}

