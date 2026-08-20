package pattern.stratergy;

import pattern.stratergy.Models.Duck;
import pattern.stratergy.Models.MallardDuck;
import pattern.stratergy.encapsulation.impl.Flys.FlyWithWings;
import pattern.stratergy.encapsulation.impl.Flys.RocketSpeedFly;
import pattern.stratergy.encapsulation.impl.quacks.Quack;

public class Main {

    public static void main(String [] args){
        System.out.println("Hi World new beginnings for Ducks");
        Duck duck;
        duck = new MallardDuck(new Quack(),new FlyWithWings());
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new RocketSpeedFly());
        duck.performFly();

    }
    
}
