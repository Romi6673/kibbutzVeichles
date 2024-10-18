public class kibbutz {
    public Vehicles[] vehiclesArr;
    public int vehicleNum;

    public kibbutz(Vehicles[] vehiclesArr){
        vehicleNum=0;
        this.vehiclesArr=vehiclesArr;
    }

    public Vehicles[] oldVehicles(){
        Vehicles[] newArr=new Vehicles[vehicleNum];
        int counter=0;
        for (int i=0;i<vehiclesArr.length;i++){
            if (vehiclesArr[i].getSteeringShape().equals("wheel") && vehiclesArr[i].getCarAge() >= 15){
                newArr[counter]=vehiclesArr[i];
                counter++;
            }
        }
        return newArr;
    }

    public int lightCarsWithWheel(){
        int counter=0;
        for (int i=0;i<vehiclesArr.length;i++){
            if (vehiclesArr[i].getSteeringShape().equals("wheel") && vehiclesArr[i] instanceof light){
                counter++;
            }
        }
        return counter;
    }
}
