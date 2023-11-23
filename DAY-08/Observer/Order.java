package Observer;

import java.util.*;

public class Order implements Observable {

    private String position;
    private String destination;
    private int timeBeforeArrival;
    List<Observer> observers = new ArrayList<>();

    public void setData(String position, String destination, int timeBeforeArrival){
        this.position = position;
        this.destination = destination;
        this.timeBeforeArrival = timeBeforeArrival;
        notifyObservers();
    }

    @Override
    public boolean notifyObservers(){
        if (observers.isEmpty()){
            return false;
        } else {
            for (int i = 0; i < observers.size(); i++) {
                observers.get(i).update(this);
            }            
            return true;
        }
    }

    @Override
    public void addObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }
    

    public String getPosition() {
        return position;
    }

    public String getDestination() {
        return destination;
    }

    public int getTimeBeforeArrival() {
        return timeBeforeArrival;
    }
}
