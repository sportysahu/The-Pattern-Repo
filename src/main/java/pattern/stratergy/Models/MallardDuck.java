package pattern.stratergy.Models;

import pattern.stratergy.encapsulation.interfaces.FlyBehavior;
import pattern.stratergy.encapsulation.interfaces.QuackBehaviour;

public class MallardDuck extends Duck{

    public MallardDuck(QuackBehaviour quackBehaviour, FlyBehavior flyBehavior) {
        super(quackBehaviour, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }

}
