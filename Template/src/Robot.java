public abstract class Robot {
    //usually abstract when subclasses define the algorithms
    //but concrete is fine
    private void start(){
        System.out.println("System booted");
    }
    //protected so that the children can modify the logic

    protected void move(){
        System.out.println("Moving to coordinates");
    }

    protected void turnOff(){
        System.out.println("Turning off");
    }

    public final void execute(){
        start();
        move();
        turnOff();
        //exactly in this order
    }

    public void upgrade(){
        System.out.println("Upgrading sire!");
        //can be upgraded anytime so sequence doesn't matter
    }
}
