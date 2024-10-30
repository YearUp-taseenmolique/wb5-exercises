package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }


    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int vehicleAge = 2024 - year;
        double depreciation;

        if (vehicleAge <= 3){
            depreciation = 0.03; //3% yearly deduction
        } else if (vehicleAge <= 6){
            depreciation = 0.06; //6% yearly deduction
        } else if (vehicleAge <= 10){
            depreciation = 0.08; //8% yearly deduction
        } else {
            return Math.max(0, getOriginalCost() - 1000); //$1000 deduction
        }

        double value = getOriginalCost() * (1 - depreciation);
        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota")){
            value *= 0.75; //25% deduction
        }
        return value;
    }
}
