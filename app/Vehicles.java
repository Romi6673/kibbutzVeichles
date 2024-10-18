public class Vehicles {

    public String carNumber;
    public int carAge;
    public int wheels;
    public String steeringShape;
    public int gasPerMin;

    public Vehicles(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin) {
        this.carNumber = carNumber;
        this.carAge = carAge;
        this.wheels = wheels;
        this.steeringShape = steeringShape;
        this.gasPerMin = gasPerMin;
    }
    public String getCarNumber() {
        return carNumber;
    }

    public int getCarAge() {
        return carAge;
    }

    public int getWheels() {
        return wheels;
    }

    public String getSteeringShape() {
        return steeringShape;
    }

    public int getGasPerMin() {
        return gasPerMin;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSteeringShape(String steeringShape) {
        this.steeringShape = steeringShape;
    }

    public void setGasPerMin(int gasPerMin) {
        this.gasPerMin  = gasPerMin;
    }

    public int noise(){
        return 1;
    }

    public int exhaust(){
        return gasPerMin*60;
    }
    public String toString() {
        return "Veichle {" + "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() + ", wheels=" +
                getWheels() + ", steeringShape='" +
                getSteeringShape() + '\'' + ", gasPerSec=" + getGasPerMin() +'}';
    }


}
