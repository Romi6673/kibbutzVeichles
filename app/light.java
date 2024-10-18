public class light extends Vehicles{
    public boolean isEngine;
    public light(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin, boolean isEngine) {
        super(carNumber, carAge, wheels, steeringShape, gasPerMin);
        this.isEngine=isEngine;
    }

    public boolean getIsEngine() {
        return isEngine;
    }

    public void setIsEngine(boolean isEngine) {
        this.isEngine = isEngine;
    }

    @Override
    public String toString() {
        return "Light{" + "carNumber='" + getCarNumber() + '\'' + ", carAge=" + getCarAge() + ", wheels=" + getWheels() + ", steeringShape='" + getSteeringShape() + '\'' + ", gasPerSec=" + getGasPerMin() + ", isEngine=" + isEngine + '}';
    }
}
