public class Main {
    public static void main(String[] args) {
        Light LivingRoomLight= new Light();
        LightOnCommand l1= new LightOnCommand(LivingRoomLight);
        Remote r1= new Remote(l1);
        r1.execute();
    }
}