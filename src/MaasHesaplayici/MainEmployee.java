package MaasHesaplayici;

public class MainEmployee {
    public static void main(String[] args) {
        Employee person1=new Employee("Nur",3000,50,2010);
        Employee person2=new Employee("Hikmet",4000,60,2005);

        person1.toPrint();
        System.out.println("==================");
        person2.toPrint();
    }
}
