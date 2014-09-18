package version5;

/**
 *
 * @author Joe
 */
	
public class MallardDuck extends Duck implements FlyAndQuackGroup {
    // Strategy components declared via abstraction
    
    private FlyBehavior flybehavior;
    private QuackBehavior quackbehavior;
    
    public MallardDuck(FlyBehavior flybehavior, QuackBehavior quackbehavior ) {
        this.flybehavior = flybehavior;
        this.quackbehavior = quackbehavior;		
    }
    
        public void performFly() {
        flybehavior.fly();
    }
    
    @Override
    public void performQuack(){
        quackbehavior.quack();
    }

        public FlyBehavior getFlybehavior() {
        return flybehavior;
    }

        public void setFlybehavior(FlyBehavior flybehavior) {
        this.flybehavior = flybehavior;
    }

    @Override
    public QuackBehavior getQuackbehavior() {
        return quackbehavior;
    }

    @Override
    public void setQuackbehavior(QuackBehavior quackbehavior) {
        this.quackbehavior = quackbehavior;
    }
    
    @Override
    public void display() {
    	System.out.println("I'm a Mallard Duck");
    }

          
}
