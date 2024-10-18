public class truck extends heavy{
    public int maxWeight;
    public truck(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin, int howManyCarry,int maxWeight) {
        super(carNumber, carAge, wheels, steeringShape, gasPerMin, howManyCarry);
        this.maxWeight=maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public int exhaust(){
        return (int) (super.exhaust()*1.5);
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
                '}';
    }
}
