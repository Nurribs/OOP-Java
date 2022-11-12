import java.util.*;
public class deneme {
    public static void main(String[] args) {

        int sayi1=1, sayi2=1, yeni;
        System.out.print (sayi1 + " " +sayi2 + " ");
        for (int i=3;i<=10;i++){
            yeni=sayi1+sayi2;
            System.out.print (yeni + " ");
            sayi1=sayi2;
            sayi2=yeni;
    }

    }
}

