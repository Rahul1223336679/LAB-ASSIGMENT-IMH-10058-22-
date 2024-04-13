public class Car {
    private String brand = "Ford";

    public static void main(String[] args) {
        Car myCar = new Car();
        String brand = myCar.getBrand();
        System.out.println(brand);
    }

    public String getBrand() {
        return brand;
    }
}