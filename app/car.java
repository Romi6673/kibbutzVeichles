public class car extends regular{
    public String company;
    public car(String carNumber, int carAge, int wheels, String steeringShape, int gasPerMin, int passangers, String company) {
        super(carNumber, carAge, wheels, steeringShape, gasPerMin, passangers);
        this.company=company;
    }

    public String getCompany() {
        return company;
    }

    public void SetCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "regular{" + "carNumber='" + getCarNumber() + '\'' + ", carAge=" + getCarAge() + ", wheels=" + getWheels() + ", steeringShape='" + getSteeringShape() + '\'' + ", gasPerSec=" + getGasPerMin() + ", passangers=" + passangers + "company :"+getCompany()+'}';
    }
}
