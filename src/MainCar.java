
public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 10, "BLUE");
        car1.printInfo();
        System.out.println("\n");
        Car car2 = new Car("BMW", 50, "RED");
        car2.printInfo();
        System.out.println("\n");
        Car car3 = new Car("Mercedes", 80, "Gray");
        car3.printInfo();



       /* Car car2= new Car();
        car2.model= "B";
        car2.speed= 20;
        car2.speed= car2.increaseSpeed(80);
        car2.speed= car2.increaseSpeed(70);
        car2.speed= car2.decreaseSpeed(50);
        System.out.println(car2.model +" Hızı: " +car2.speed);

        Car car3= new Car();
        car3.model= "C";
        car3.speed= 25;
        System.out.println(car3.model +" Hızı: " +car3.speed);*/

    }
}