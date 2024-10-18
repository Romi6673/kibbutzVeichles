public class bicycle extends light{
    public boolean isCart;

    public bicycle(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin, boolean isEngine, boolean isCart) {
        super(carNumber, carAge, wheels, steeringShape, gasPerMin, isEngine);
        this.isCart=isCart;
    }

    public boolean getIsCart() {
        return isCart;
    }

    public void setIsCart(boolean isCart) {
        this.isCart = isCart;
    }

    @Override
    public String toString() {
        return "cart{" + "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() + ", wheels=" + getWheels() + ", steeringShape='" +
                getSteeringShape() + '\'' + ", gasPerSec=" + getGasPerMin() +
                ", isEngine=" + isEngine + ",  is cart=" + isCart;
    }
}
