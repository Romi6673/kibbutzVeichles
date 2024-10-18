public class main {
    public static void main(String[]args){

    }
    public double getAllGas(Vehicles[] arr){
        double sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i].exhaust();
        }
        return sum;
    }

    public void carsNoises(Vehicles[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].noise());
        }
    }

    public int passangersRegular(Vehicles[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof regular){
                sum = sum + ((regular) arr[i]).getPassangers();
            }
        }
        return sum;
    }


}
