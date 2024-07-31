public class PolymorphismExample {
    public static void main(String[] args) {

        PExampleVehicle vehicle = new PExamCar();
        getName(vehicle);
        PExampleVehicle vehicle1 = new PExamBike();
        getName(vehicle1);
    }

    private static void getName(PExampleVehicle vehiclee) {
        vehiclee.name();
    }
}
