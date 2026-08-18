package pattern.stratergy.encapsulation.impl.Flys;

import pattern.stratergy.encapsulation.interfaces.FlyBehavior;

public class RocketSpeedFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Super sonic speed flaps");
    }
}
