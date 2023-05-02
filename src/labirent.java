import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import java.util.Arrays;
import java.util.List;

public class labirent {
    private int lab[][] = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
            {1, 0, 1, 1, 1, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
            {1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1}
    };
    int baslangicSatir = 1, baslangicSutun = 0;
List<String> yonler = Arrays.asList("Sola", "Sağa", "Yukarı", "Aşağı", "ÇIKIŞ");
private ImageIcon fareResmi = new ImageIcon("fare.png");

public String fareResmiYoluAl(){
    URL url = getClass().getResource("fare.png");
    return url == null ? "" : url.toString();
}

public void oyunuBaslat() {
    JFrame pencere = new JFrame("LABİRENT");
    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pencere.setSize(600, 600);

    JPanel butonPaneli = new JPanel();
    butonPaneli.setLayout(new FlowLayout(FlowLayout.CENTER));
    butonPaneli.setBackground(Color.DARK_GRAY);

    ActionListener butonDinleyici = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String butonMetni = ((JButton) e.getSource()).getText();

            lab[baslangicSatir][baslangicSutun] = 0;

            switch (butonMetni) {
                case "Sola":
                    solaGit();
                    break;
                case "Sağa":
                    sagaGit();
                    break;
                case "Yukarı":
                    yukariGit();
                    break;
                case "Aşağı":
                    asagiGit();
                    break;
                case "ÇIKIŞ":
                    System.exit(0);
                    break;
            }
            lab[baslangicSatir][baslangicSutun] = -1;
            if (lab[9][8] == -1) {
                JOptionPane.showMessageDialog(pencere, "TEBRİKLER, ÇIKIŞA ULAŞTINIZ!!");
                System.exit(0);
            }
            pencere.repaint();
        }
    };

    for (String s : yonler) {
        JButton btn = new JButton(s);
        btn.addActionListener(butonDinleyici);
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setForeground(Color.BLACK);
        butonPaneli.add(btn);
    }

    pencere.add(butonPaneli, BorderLayout.SOUTH);

    JPanel labirentPaneli = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int satir = 0; satir < lab.length; satir++) {
                for (int sutun = 0; sutun < lab[satir].length; sutun++) {
                    if (lab[satir][sutun] == 1) {
                        g.setColor(Color.RED);
                        g.fillRect(sutun * 50, satir * 50, 50, 50);
                    } else if (lab[satir][sutun] == -1) {
                        g.drawImage(fareResmi.getImage(), sutun * 50, satir * 50, 50, 50, this);
                    } else {
                        g.setColor(Color.WHITE);
                        g.fillRect(sutun * 50, satir * 50, 50, 50);
                    }
                }
            }
        }
    };

    pencere.add(labirentPaneli, BorderLayout.CENTER);
    pencere.setVisible(true);
}

public void solaGit() {
    baslangicSutun--;
    if (baslangicSutun == -1 || lab[baslangicSatir][baslangicSutun] == 1)
    baslangicSutun++;
    }
    
    public void sagaGit() {
    baslangicSutun++;
    if (baslangicSutun == lab[baslangicSatir].length || lab[baslangicSatir][baslangicSutun] == 1)
    baslangicSutun--;
    }
    
    public void yukariGit() {
    baslangicSatir--;
    if (baslangicSatir == -1 || lab[baslangicSatir][baslangicSutun] == 1)
    baslangicSatir++;
    }
    
    public void asagiGit() {
    baslangicSatir++;
    if (baslangicSatir == lab.length || lab[baslangicSatir][baslangicSutun] == 1)
    baslangicSatir--;
    }
    
    public static void main(String[] args) {
    labirent oyun = new labirent();
    oyun.oyunuBaslat();
    }
}