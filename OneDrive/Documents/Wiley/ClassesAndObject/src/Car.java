import java.util.Scanner;

public class Car {
    private String color;
    private String model;
    private String make;

    public Car(String color, String model, String make) {
        this.color = color;
        this.model = model;
        this.make = make;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int setNumberOfDaysInInventory(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Tell me the number of days that a car has been in inventory:");
        int inputReader= myScanner.nextInt();
        System.out.print(inputReader);
        return inputReader;
    }
}
