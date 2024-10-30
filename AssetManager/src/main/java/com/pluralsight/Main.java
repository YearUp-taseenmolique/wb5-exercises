package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        //adding 2 houses
        assets.add(new House("My house", "2010-10-15", 200000, "45 Milk St.", 2, 4000, 6000 ));
        assets.add(new House("My Beach house", "2016-3-5", 350000, "45 Beach St.", 1, 2500, 5000 ));

        //adding 2 vehicles
        assets.add(new Vehicle("My Honda", "2020-04-19", 5000, "Honda Accord", 2010, 150000));
        assets.add(new Vehicle("My Porsche", "2024-04-19", 300000, "Porsche GT3 RS", 2024, 1));

        //Looping through assets and displaying the information
        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Data Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Value: $" + asset.getValue());

            //Using instanceof to check if it's a House or Vehicle
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress() + "\nSquare Footage: " + house.getSquareFoot() + "\nLot Size: " + house.getLotSize());
            } else if (asset instanceof Vehicle){
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel() + "\nYear: " + vehicle.getYear() + "\nMileage: " + vehicle.getOdometer());
            }
            System.out.println();
        }
    }
}