public class cart extends light{
    public boolean isElectronic;
    public cart(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin, boolean isEngine,boolean isElectronic) {
        super(carNumber, carAge, wheels, steeringShape, gasPerMin, isEngine);
        this.isElectronic=isElectronic;
    }

    public boolean getIsElectronic() {
        return isElectronic;
    }

    public void setIsElectronic(boolean isElectronic) {
        this.isElectronic = isElectronic;
    }

    @Override
    public int exhaust(){
        if (isElectronic==false){
            return 0;
        }
        return super.exhaust();
    }

    public void hitchhikers(){
        System.out.println("cart ride is on the way");
    }

    @Override
    public String toString() {
        return "cart{" + "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() + ", wheels=" + getWheels() + ", steeringShape='" +
                getSteeringShape() + '\'' + ", gasPerSec=" + getGasPerMin() +
                ", isEngine=" + getIsEngine() + ", isElectronic" + getIsElectronic();
    }
}
