public abstract class Car {

    String vinNumber;
    String make;
    String model;
    int mileage;


    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }



    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


    // GetInfo
    public String getInfo(){
        String getInfo = "";
        return  getInfo;
    }

    // toString


    @Override
    public String toString() {
        return
                "VIN: " + vinNumber + '\'' +
                ", Make: '" + make + '\'' +
                ", Model: '" + model + '\'' +
                ", Mileage: " + mileage
                ;
    }
}

