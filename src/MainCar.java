public class MainCar {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.model= "A";
        car1.speed= 10;
        System.out.println(car1.type);
        car1.speed= car1.increaseSpeed(30);
        car1.speed= car1.increaseSpeed(50);
        car1.speed= car1.increaseSpeed(50);
        car1.speed= car1.increaseSpeed(50);
        System.out.println(car1.model + " Hızı: " +car1.speed);

        Car car2= new Car();
        car2.model= "B";
        car2.speed= 20;
        car2.speed= car2.increaseSpeed(80);
        car2.speed= car2.increaseSpeed(70);
        car2.speed= car2.decreaseSpeed(50);
        System.out.println(car2.model +" Hızı: " +car2.speed);

        Car car3= new Car();
        car3.model= "C";
        car3.speed= 25;
        System.out.println(car3.model +" Hızı: " +car3.speed);

    }
}