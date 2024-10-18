public class miniTruck extends truck{
    public String owner;
    public miniTruck(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin, int howManyCarry,int maxWeight, String owner) {
        super(carNumber, carAge, wheels, steeringShape, gasPerMin, howManyCarry, maxWeight);
        this.owner=owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", wheels=" + getWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", gasPerSec=" + getGasPerMin() +
                ", howManyCarry=" + getHowManyCarry() +
                ", max weight='" + getMaxWeight() + '\'' +
                ", owner=" + getOwner()+
                '}';
    }
}
