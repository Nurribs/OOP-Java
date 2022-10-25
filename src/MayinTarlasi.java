import java.util.Scanner;

public class MayinTarlasi {
        public static void main(String[] args) {

            int [][] zemin = new int [10][10];
            int satir,sutun, i, puan;
            puan = 0;
            Scanner oku = new Scanner(System.in);
            for(i=0;i<10;i++)
            {
                satir = (int) (Math.random()*10);
                sutun = (int) (Math.random()*10);
                if(zemin[satir][sutun]!=1)
                    zemin[satir][sutun] = 1;
                else
                    i--;

            }
            do{
                System.out.print("Lutfen satiri giriniz: ");
                satir = oku.nextInt();
                System.out.print("Lutfen sutunu giriniz: ");
                sutun = oku.nextInt();

                if(zemin[satir][sutun] != 1) {
                    puan++;
                    System.out.println("Basarili Hamle Mevcut Pauniniz: " + puan);
                }
            }while(zemin[satir][sutun] !=1);

            System.out.println("Oyun Bitti " + "Son puan : "+puan);

        }
}
