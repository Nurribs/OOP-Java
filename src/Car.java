class Car {
    //Nitelikler
    String type= "Sedan";
    String model;
    String color;
    int speed;
    int speedLimit=180;

    //Davranışlar

    int increaseSpeed(int increment){
        if (speed + increment < speedLimit){
            speed += increment;
        }
        return speed;
    }

    int decreaseSpeed(int decrease){
        if (speed>0){
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed(){
        System.out.println("Speed: " +speed);
    }
}
