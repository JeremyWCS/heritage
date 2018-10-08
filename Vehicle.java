public abstract class Vehicle {

    //attributs
    private String brand;
    private int kilometers;

    //constructeurs
    public Vehicle(String brand) {
        this.brand=brand;
        this.kilometers=0;
    }

    //getters et setters

    public String getBrand () {
        return this.brand;
    }

    public int getKilometers () {
        return this.kilometers;
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers=kilometers;
    }

    //méthode abstraite
    public abstract String doStuff();
}