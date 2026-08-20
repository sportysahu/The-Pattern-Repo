package pattern.observer.CustomObserver.Model.interfaces;

public interface Subject {

    public void registerObesrver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();


}
