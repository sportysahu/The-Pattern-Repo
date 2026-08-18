package pattern.stratergy.Models;

import pattern.stratergy.encapsulation.interfaces.FlyBehavior;
import pattern.stratergy.encapsulation.interfaces.QuackBehaviour;

public class RubberDuck extends Duck{

    public RubberDuck(QuackBehaviour quackBehaviour, FlyBehavior flyBehavior) {
        super(quackBehaviour, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

}
