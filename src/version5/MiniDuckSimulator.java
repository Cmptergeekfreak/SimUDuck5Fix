package version5;

/**
 *
 * @author Joe
 */

public class MiniDuckSimulator {

	public static void main(String[] args) {
            
                        FlyAndQuackGroup mallard = new MallardDuck(new FlyWithWings(), new Quack());                
            QuackOnlyGroup rubber = new RubberDuck(new Quack());
            
            mallard.display();
            mallard.performQuack();
            mallard.performFly();
            
            mallard.setFlybehavior(new FlyRocketPowered());
            mallard.setQuackbehavior(new Squeak());         
            mallard.performFly();
            mallard.performQuack();
            
            mallard.setFlybehavior(new FlyWithWings());
            mallard.setQuackbehavior(new Quack());    
            mallard.performFly();
            mallard.performQuack();          

            
        }
}
