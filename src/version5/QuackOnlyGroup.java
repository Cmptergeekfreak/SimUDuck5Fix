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
public interface QuackOnlyGroup {
    public abstract QuackBehavior getQuackbehavior();
    
    public abstract void setQuackbehavior(QuackBehavior quackbehavior);
    
    public abstract void display();
    
    public abstract void performQuack();
}
