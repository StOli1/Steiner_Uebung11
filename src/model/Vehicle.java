package model;

public class Vehicle {
    private String color;
    private String owner;
    private String manufacturer;
    private String model;
    private String licensePlate;

    public Vehicle(String color, String owner, String manufacturer, String model, String licensePlate) {
        this.color = color;
        this.owner = owner;
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Color: %s%n", getColor()));
        stringBuilder.append(String.format("Owner: %s%n", getOwner()));
        stringBuilder.append(String.format("Manufacturer: %s%n", getManufacturer()));
        stringBuilder.append(String.format("Model: %s%n", getModel()));
        stringBuilder.append(String.format("License-Plate: %s%n", getLicensePlate()));
        return stringBuilder.toString();
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


}
