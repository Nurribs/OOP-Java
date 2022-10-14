class Car {
    //Nitelikler

    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    //Davranışlar

    Car(String model, int speed, String color) {//veri tipi sınıfta nasıl girildiyse burda da öyle girilmesi gerekir.
        System.out.println("Nesne oluşturuldu.");
        this.model = model;
        this.speed = speed;
        this.color = "Blue";
        this.type = "Sedan";
        this.speedLimit = 180;
        System.out.println(this.model); // ekrana ilk önce metot(constructor(yapıcı) metot) içini yazdırır.
    }

    void increaseSpeed(int increment) {
        if (this.speed + increment < this.speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println("Speed: " + this.speed);
    }


    void printInfo() {
        System.out.println("Model\t:" +this.model);
        System.out.println("Color\t:" +this.color);
        System.out.println("Type\t:" +this.type);
        System.out.println("Speed\t:" +this.speed);

    }
}

