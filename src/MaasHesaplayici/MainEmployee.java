package MaasHesaplayici;

public class MainEmployee {
    public static void main(String[] args) {
        Employee person1=new Employee("A kişisi",3000,50,2010);
        Employee person2=new Employee("B kişisi",4000,60,1985);

      person1.toPrint();
      System.out.println("=============");
      person2.toPrint();
    }
}
