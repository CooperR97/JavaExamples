package Bikes;

public class Bike {
    int gears;
    String color, brand;
    static int numOfBikes;

    public Bike(int gears, String color, String brand){
        this.gears = gears;
        this.color = color;
        this.brand = brand;
        numOfBikes++;
    }

    public void State(){
        System.out.println("gears: " + gears + " color: " + color + " brand: " + brand +
                " Total number of bikes: " + numOfBikes);
    }

    public static void NumberOfBikes(){
        System.out.println("Total Number of Bikes: " + numOfBikes);
    }
}