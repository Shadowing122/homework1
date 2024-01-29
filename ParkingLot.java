public class ParkingLot {
    public ParkingSpot[] lot; //constants go up here

    public ParkingLot(){
        this.lot = new ParkingSpot[10];
        for(int i = 0; i < 10; i++) {
            if (i<2){
                this.lot[i] = new ParkingSpot(true);
            } 
            else {
                this.lot[i] = new ParkingSpot(false);
            }
        }
    }

    public int parkCar(Car car){
        int index = -1; // -1 is bad value
        for (int i=0; i<10; i++){
            if ((this.lot[i].handicap == true) & (car.handicap == true)){
                index = i;
                lot[i].car = car;
            } else if ((this.lot[i].handicap == false) & (car.handicap == false)){
                index = i;
                lot[i].car = car;
            }
        }
        return index;
    }

    public Car removeCar(int lotNum){
        Car car = null;
        if (this.lot[lotNum].car != null){
            car = this.lot[lotNum].car;
            this.lot[lotNum].car = null;
        }
        return car;
    }

    public String toString(){
        int handicapNum = 0;
        int emptyNum = 0;
        for (int i=0; i<this.lot.length; i++){
            if ((this.lot[i].handicap == true) & (this.lot[i].car == null)){
                handicapNum += 1;
                emptyNum += 1;
            }
        }
        return "";
    }
}
