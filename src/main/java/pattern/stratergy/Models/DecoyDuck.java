package pattern.stratergy.Models;

import pattern.stratergy.encapsulation.interfaces.FlyBehavior;
import pattern.stratergy.encapsulation.interfaces.QuackBehaviour;

public class DecoyDuck extends Duck{

    public DecoyDuck(QuackBehaviour quackBehaviour, FlyBehavior flyBehavior) {
        super(quackBehaviour, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }

}
