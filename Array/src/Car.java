public class Car {
        String brand;
        String model;
        int year;

        // Constructor
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
void method(int x, String y ){
   method( 12, "chathurika");
}

        // Method to display car information
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }

        public static void main(String[] args) {
            // Creating objects of Car class
            Car car1 = new Car("Toyota", "Camry", 2022);
            Car car2 = new Car("Honda", "Accord", 2023);

            // Displaying information about the cars
            System.out.println("Car 1 Information:");
            car1.displayInfo();

            System.out.println("\nCar 2 Information:");
            car2.displayInfo();
        }
}
