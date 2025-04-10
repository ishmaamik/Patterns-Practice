public class CarFactory extends VehicleFactory{
    @Override
    public IVehicle createVehicle(String car) {
        switch (car){
            case "Mercedes":
                return new Mercedes();
            case "BMW":
                return new BMW();
            default:
                throw new IllegalArgumentException();
        }
    }
}
