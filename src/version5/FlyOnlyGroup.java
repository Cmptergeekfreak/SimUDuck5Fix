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
public interface FlyOnlyGroup {
    public abstract FlyBehavior getFlybehavior();

    public abstract void setFlybehavior(FlyBehavior flybehavior); 
    
    public abstract void display();
    
    public void performFly();
}
