public class ParkingTester {
    public static void main(String []args){
        ParkingLot lot = new ParkingLot();
        System.out.println(lot);
        Car car1 = new Car("A", "Infiniti", true);
        int i = lot.parkCar(car1);
        System.out.println(lot);
        Car car2 = new Car("B", "Cadiliac", false);
        lot.parkCar(car2);
        System.out.println(lot);
        lot.removeCar(i);
        System.out.println(lot);
    }
}
