public class AbstractionDemo {

    static abstract class Vehicle {

       public abstract void startEngine();

      public  void stopVehicle() {
            System.out.println("The vehicle has stopped.");
        }
    }
    static class Car extends Vehicle {

        @Override
      public  void startEngine() {
            System.out.println("The car engine starts with a key.");
        }
    }
    static class Motorcycle extends Vehicle {

        @Override
      public  void startEngine() {
            System.out.println("The motorcycle engine starts with a button.");
        }
    }

    public static void main(String[] args) {

        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        myCar.startEngine();
        myCar.stopVehicle();

        myMotorcycle.startEngine();
        myMotorcycle.stopVehicle();
    }
}