import java.io.Serializable;
public class Car implements Serializable{
    private final String model;
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;

    public Car(String make, int year, String model){
        this.make = make;
        this.year = year;
        this.model = model;

    }
    @Override
    public String toString(){
        String carInfo = "";
        carInfo += "\nBrand: " + this.make;
        carInfo += "\nYear: " + this.year;
        carInfo += "\nModel: " + this.model;
        return carInfo;
    }

}
