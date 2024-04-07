
public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String brand, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public static Car[] createCarArray() {
        Car car1 = new Car(1, "Toyota", "Camry", 2020, "Red", 25000.0, "ABC123");
        Car car2 = new Car(2, "Honda", "Civic", 2018, "Blue", 20000.0, "XYZ789");
        Car car3 = new Car(3, "Ford", "Mustang", 2019, "Yellow", 35000.0, "DEF456");

        return new Car[] { car1, car2, car3 };
    }

    public static void main(String[] args) {
        Car[] cars = createCarArray();

        System.out.println("List of Cars:");
        for (Car car : cars) {
            System.out.println("ID: " + car.getId() + ", Brand: " + car.getBrand() + ", Model: " + car.getModel() +
                    ", Year: " + car.getYear() + ", Color: " + car.getColor() + ", Price: $" + car.getPrice() +
                    ", Registration Number: " + car.getRegistrationNumber());
        }
    }
}