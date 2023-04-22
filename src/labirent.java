package LabirentOyunu;

import javax.swing.*;

public class labirent {
    private int lab[][] = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},  //0. satır
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},  //1.satır
            {1, 1, 1, 0, 1, 0, 1, 1, 0, 1},  //2.satır
            {1, 0, 0, 0, 1, 0, 0, 1, 0, 1},  //3.satır
            {1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
            {1, 0, 1, 1, 1, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
            {1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1}
    };

    int baslamaSatir = 1, baslamaSutun = 0;  //indeks

    Object stic[] = {"Sola", "Sağa", "Yukarı", "Aşağı", "ÇIKIŞ"};

    public String ekranAl() {
        String ekran = "<html><table>";
        for (int satir = 0; satir < lab.length; satir++) {
            ekran += "<tr>";
            for (int sutun = 0; sutun < lab[satir].length; sutun++) {
                if (lab[satir][sutun] == 1) {
                    ekran += "<td bgcolor='red' width=25></td>";
                } else if (lab[satir][sutun] == 0) {
                    ekran += "<td bgcolor='white' width=25></td>";
                } else {
                    ekran += "<td bgcolor='blue' width=25></td>";
                }
            }
            ekran += "</tr>";
        }
        ekran += "</table></html>";
        System.out.println(ekran);
        return ekran;
    }

    public void oyunuBaslat() {
        lab[baslamaSatir][baslamaSutun] = -1;
        int oyuncuSecim;
        while (lab[9][8] != -1) {
            oyuncuSecim = JOptionPane.showOptionDialog(null, ekranAl(), "LABİRENT",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, stic, stic[4]);
            lab[baslamaSatir][baslamaSutun] = 0;
            switch (oyuncuSecim) {
                case 0:
                    solaGit();
                    break;
                case 1:
                    sagaGit();
                    break;
                case 2:
                    yukariGit();
                    break;
                case 3:
                    asagiGit();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            lab[baslamaSatir][baslamaSutun] = -1;
            if (lab[9][8] == -1){
                JOptionPane.showMessageDialog(null,"TEBRİKLER, ÇIKIŞA ULAŞTINIZ!!");
            }
        }
        JOptionPane.showMessageDialog(null,"OYUN BİTTİ.");
    }

    public void solaGit(){
        baslamaSutun--;
        if (baslamaSutun== -1 || lab[baslamaSatir][baslamaSutun]== 1)
            baslamaSutun++;
    }

    public void sagaGit(){
        baslamaSutun++;
        if (baslamaSutun== lab[baslamaSatir].length || lab[baslamaSatir][baslamaSutun]== 1)
            baslamaSutun--;
    }

    public void yukariGit(){
        baslamaSatir--;
        if (baslamaSatir== -1 || lab[baslamaSatir][baslamaSutun]== 1)
            baslamaSatir++;
    }

    public void asagiGit(){
        baslamaSatir++;
        if (baslamaSatir== lab.length || lab[baslamaSatir][baslamaSutun]== 1)
            baslamaSatir--;
    }

    public static void main(String[] args){
        labirent oyun= new labirent();
        oyun.oyunuBaslat();

    }

}

