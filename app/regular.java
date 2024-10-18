public class regular extends Vehicles{
    public int passangers;
    public regular(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin, int passangers) {
        super(carNumber, carAge, wheels, steeringShape, gasPerMin);
        this.passangers=passangers;
    }

    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public int noise(){
        return 2;
    }

    public void hitchhikers(){
        System.out.println("ride is on the way");
    }

    @Override
    public int exhaust(){
        return super.exhaust()+1;
    }

    @Override
    public String toString() {
        return "regular{" + "carNumber='" + getCarNumber() + '\'' + ", carAge=" + getCarAge() + ", wheels=" + getWheels() + ", steeringShape='" + getSteeringShape() + '\'' + ", gasPerSec=" + getGasPerMin() + ", passangers=" + passangers + '}';
    }
}
