package Bikes;

public class BikeEnvironment {

    public static void main(String[] args){
        Bike bike1 = new Bike(6, "blue", "Schwinn");
        bike1.State();
        Bike bike2 = new Bike(5, "red", "Giant");
        bike2.State();
        Bike.NumberOfBikes();
    }
}
