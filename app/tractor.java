public class tractor extends heavy{
    public String carryType;
    public tractor(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin, int howManyCarry,String CarryType) {
        super(carNumber, carAge, wheels, steeringShape, gasPerMin, howManyCarry);
        this.carryType=CarryType;
    }

    public String getCarryType() {
        return carryType;
    }

    public void setCarryType(String carryType) {
        this.carryType = carryType;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", wheels=" + getWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", gasPerSec=" + getGasPerMin() +
                ", howManyCarry=" + getHowManyCarry() +
                ", carryType='" + carryType + '\'' +
                '}';
    }
}
