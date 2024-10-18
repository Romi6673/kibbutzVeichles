public class heavy extends Vehicles{
    public int howManyCarry;
    public heavy(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin, int howManyCarry) {
        super(carNumber, carAge, wheels, steeringShape, gasPerMin);
        this.howManyCarry=howManyCarry;
    }

    public int getHowManyCarry() {
        return howManyCarry;
    }

    public void setHowManyCarry(int howManyCarry) {
        this.howManyCarry = howManyCarry;
    }

    @Override
    public int exhaust(){
        return super.exhaust()+(howManyCarry*500);
    }

    @Override
    public String toString() {
        return "heavy{" + "carNumber='" + getCarNumber() + '\'' + ", carAge=" + getCarAge() + ", wheels=" + getWheels() + ", steeringShape='" + getSteeringShape() + '\'' + ", gasPerSec=" + getGasPerMin() + ", how many carry=" + howManyCarry + '}';
    }
}
