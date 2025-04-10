public class TruckFactory {
    public IVehicle createVehicle(String truck) {
        switch (truck){
            case "Lorry":
                return new Lorry();
            default:
                throw new IllegalArgumentException();
        }
    }
}
