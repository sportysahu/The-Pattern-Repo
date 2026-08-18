package pattern.stratergy.Models;
 import pattern.stratergy.encapsulation.interfaces.FlyBehavior;
 import pattern.stratergy.encapsulation.interfaces.QuackBehaviour;

public abstract class Duck {

    public Duck(QuackBehaviour quackBehaviour, FlyBehavior flyBehavior) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehavior = flyBehavior;
    }

    public FlyBehavior flyBehavior;
    public QuackBehaviour quackBehaviour;

    public void swim(){
        System.out.println("Swimming in the water like a Duck");
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior=flyBehavior;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour=quackBehaviour;
    }

    public abstract void display();



}
