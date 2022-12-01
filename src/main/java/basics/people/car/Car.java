package basics.people.car;

public class Car {

    private String mark;

    private double carMileage;

    private double mileageToNextServices  = 20000;

    public Car(String mark, double mileage, double mileageToNextServices) {
        this.mark = mark;
        this.carMileage = mileage;
        this.mileageToNextServices = mileageToNextServices;
    }

    public void carInfo(){
        System.out.printf("this car is maybe by: %s and has %s km %n", mark, carMileage);
    }
    public void distanceFromStart(double distance){
        double carMileageAfterDistance = distance + carMileage;
        System.out.println("You made: " + carMileageAfterDistance);
    }
    public void nextService(){
        double calculateMileageToNextService = carMileage + mileageToNextServices;
        System.out.println("Next service in: " + calculateMileageToNextService);
    }

    public String getMark() {
        return mark;
    }

    public double getCarMileage() {
        return carMileage;
    }

    public double getMileageToNextServices() {
        return mileageToNextServices;
    }
}
