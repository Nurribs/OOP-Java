package MaasHesaplayici;

public class Employee {
    String name;
    double salary; //çalışanın maaşı
    int workHours; //haftalık çalışma saati
    int hireYear; //işe başlangıç yılı

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            System.out.println("Vergi uygulanmayacaktır.");
            return this.salary;
        } else {
            double vergi = this.salary * 0.03;
            return this.salary - vergi;
        }
    }

    public int bonus() {
        if (this.workHours > 40) {
            int bonus = (this.workHours - 40) * 30;
            return bonus;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {

        if (this.hireYear <= 0 || this.hireYear > 2021) {
            System.out.println("Hatalı bir başlangıç yılı girilmiştir.");
        } else {
            int yilFarki = 2021 - this.hireYear;
            double zam = 0.0;
            if (yilFarki > 0 && yilFarki < 10) {
                zam = this.salary * 0.05;
                return zam;
            } else if (yilFarki > 9 && yilFarki < 20) {
                zam = this.salary * 0.10;
                return zam;
            } else if (yilFarki > 19) {
                zam = this.salary * 0.15;
                return zam;
            } else if (yilFarki == 0) {
                return 0;
            }
        }
        return 0;
    }

    public double firstTotal() {
        double firstTotal = this.salary + raiseSalary();
        return firstTotal;
    }

    public double secondTotal() {
        double secondTotal = this.salary + bonus() - tax();
        return secondTotal;
    }

    void toPrint() {
        System.out.println("Çalışanın Adı: " + this.name);
        System.out.println("Çalışanın maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Toplam maaş: " + firstTotal());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + secondTotal());
    }
}
