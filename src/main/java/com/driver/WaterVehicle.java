package com.driver;

public interface WaterVehicle {

    void getVehicleName();
    void getVehicleCapacity();


}
 class boat implements WaterVehicle{

     private String name;
     private int capacity;

     @Override
    public void getVehicleName() {
        this.name=name;
        this.capacity=capacity;
    }

     @Override
     public void getVehicleCapacity() {
         this.name=name;
         this.capacity=capacity;
     }
 }
