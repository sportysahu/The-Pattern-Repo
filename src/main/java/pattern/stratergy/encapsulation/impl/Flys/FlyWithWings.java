package pattern.stratergy.encapsulation.impl.Flys;

import pattern.stratergy.encapsulation.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flap Flap Flying with wings ");
    }
}
