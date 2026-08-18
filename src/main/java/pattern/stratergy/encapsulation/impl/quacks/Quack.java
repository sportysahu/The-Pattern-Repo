package pattern.stratergy.encapsulation.impl.quacks;

import pattern.stratergy.encapsulation.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack Quack!! ");
    }
}
