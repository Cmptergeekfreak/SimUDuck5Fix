/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package version5;

/**
 *
 * @author Joe
 */
public class RubberDuck extends Duck implements QuackOnlyGroup{
    
    private QuackBehavior quackbehavior;
    
    public RubberDuck(QuackBehavior quackbehavior) {
        this.quackbehavior = quackbehavior;
    }

    @Override
    public void performQuack(){
        quackbehavior.quack();
    }
             
    @Override
    public QuackBehavior getQuackbehavior() {
        return quackbehavior;
    }

    @Override
    public void setQuackbehavior(QuackBehavior quackbehavior) {
        this.quackbehavior = quackbehavior;
    }

    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
