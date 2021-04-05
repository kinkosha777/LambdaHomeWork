package kg.megacom.models;

import kg.megacom.enums.BikeColor;
import kg.megacom.enums.BikeMakers;
import kg.megacom.enums.BikeType;

public class Bike {

    private BikeMakers bikeMakers;
    private BikeType bikeType;
    private BikeColor bikeColor;
    private double price;

    public Bike(BikeMakers bikeMakers, BikeType bikeType, BikeColor bikeColor, double price) {
        this.bikeMakers = bikeMakers;
        this.bikeType = bikeType;
        this.bikeColor = bikeColor;
        this.price = price;
    }

    public BikeMakers getBikeMakers() {
        return bikeMakers;
    }

    public void setBikeMakers(BikeMakers bikeMakers) {
        this.bikeMakers = bikeMakers;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    public BikeColor getBikeColor() {
        return bikeColor;
    }

    public void setBikeColor(BikeColor bikeColor) {
        this.bikeColor = bikeColor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
