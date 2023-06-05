import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingConstants;

public class OyunEkrani extends JFrame implements ActionListener {

    private JPanel contentPane;
    static ArrayList<JButton> futbolcuButtons = new ArrayList<>();
    static ArrayList<JButton> basketbolcuButtons = new ArrayList<>();
    static boolean futbolcuSecim = true;
    static boolean basketbolcuSecim = true;
    static String sira;
    static String oyunDurum;
    static String pozisyonBilgisi;
    JButton btn9;

    public void oyunEkrani(String isim) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OyunEkrani frame = new OyunEkrani(isim);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public OyunEkrani(String isim) {
        setBackground(Color.BLACK);
        setForeground(new Color(0, 0, 0));
        sira = "futbolcu";
        futbolcuSecim = true;
        basketbolcuSecim = true;
        setTitle("Sporcu Kart Oyunu");
        setFont(new Font("MV Boli", Font.PLAIN, 20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1500, 820);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 51, 51));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Oynama Sýrasý:");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel.setBounds(170, 30, 190, 34);
        contentPane.add(lblNewLabel);

        JLabel lbl1 = new JLabel("");
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbl1.setBounds(335, 30, 190, 34);
        lbl1.setText("futbolcu");
        contentPane.add(lbl1);

        JLabel lbl_isim = new JLabel("");
        lbl_isim.setForeground(Color.WHITE);
        lbl_isim.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbl_isim.setBounds(1180, 110, 190, 34);
        lbl_isim.setText(isim);
        contentPane.add(lbl_isim);

        JLabel lbl_skor1 = new JLabel("0");
        lbl_skor1.setForeground(Color.WHITE);
        lbl_skor1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbl_skor1.setBounds(1180, 140, 57, 34);
        contentPane.add(lbl_skor1);

        JLabel lblNewLabel_1 = new JLabel("Bilgisayar");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel_1.setBounds(1180, 620, 111, 33);
        contentPane.add(lblNewLabel_1);

        JLabel lbl_skor2 = new JLabel("0");
        lbl_skor2.setForeground(Color.WHITE);
        lbl_skor2.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbl_skor2.setBounds(1180, 650, 57, 33);
        contentPane.add(lbl_skor2);

        JLabel lblNewLabel_2 = new JLabel("Durum:");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel_2.setBounds(570, 30, 88, 34);
        contentPane.add(lblNewLabel_2);

        JLabel lblDurum = new JLabel("Kart seçilmedi...");
        lblDurum.setForeground(Color.WHITE);
        lblDurum.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblDurum.setBounds(655, 30, 240, 34);
        contentPane.add(lblDurum);

        JLabel lblNewLabel_2_1 = new JLabel("Pozisyon Bilgisi:");
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel_2_1.setBounds(940, 30, 190, 34);
        contentPane.add(lblNewLabel_2_1);

        JLabel lblPozisyon = new JLabel("Kart seçilmedi...");
        lblPozisyon.setForeground(Color.WHITE);
        lblPozisyon.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblPozisyon.setBounds(1110, 30, 240, 34);
        contentPane.add(lblPozisyon);


        JButton btn1 = new JButton("");
        btn1.setBounds(150, 70, 230, 350);

        JButton btn2 = new JButton("");
        btn2.setBounds(390, 70, 230, 350);

        JButton btn3 = new JButton("");
        btn3.setBounds(630, 70, 230, 350);

        JButton btn4 = new JButton("");
        btn4.setBounds(870, 70, 230, 350);

        JButton btn5 = new JButton("");
        btn5.setBounds(150, 430, 230, 350);

        JButton btn6 = new JButton("");
        btn6.setBounds(390, 430, 230, 350);

        JButton btn7 = new JButton("");
        btn7.setBounds(630, 430, 230, 350);

        JButton btn8 = new JButton("");
        btn8.setBounds(870, 430, 230, 350);

        btn9 = new JButton("");
        btn9.setBounds(1118, 228, 230, 350);
        contentPane.add(btn9);

        JLabel lblNewLabel_3 = new JLabel("Bilgisayarýn Seçtiði Kart");
        lblNewLabel_3.setBackground(Color.WHITE);
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel_3.setBounds(1100, 190, 260, 34);
        contentPane.add(lblNewLabel_3);

        futbolcuButtons.add(btn1);
        futbolcuButtons.add(btn2);
        futbolcuButtons.add(btn3);
        futbolcuButtons.add(btn4);

        basketbolcuButtons.add(btn5);
        basketbolcuButtons.add(btn6);
        basketbolcuButtons.add(btn7);
        basketbolcuButtons.add(btn8);

        for (int i = 0; i < 4; i++) {
            futbolcuButtons.get(i).setText(Test.futbolcuList.get(Oyuncu.secilenFutbolcu.get(i)).getSporcuIsim());
            futbolcuButtons.get(i).setIcon(Test.futbolcuList.get(Oyuncu.secilenFutbolcu.get(i)).getImageIcon());
            contentPane.add(futbolcuButtons.get(i));
        }

        for (int i = 0; i < 4; i++) {
            basketbolcuButtons.get(i).setText(Test.basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(i)).getSporcuIsim());
            basketbolcuButtons.get(i).setIcon(Test.basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(i)).getImageIcon());
            contentPane.add(basketbolcuButtons.get(i));
        }

        JLabel lblArkaPlan = new JLabel();
        lblArkaPlan.setBounds(-10, 0, 1500, 800);
        lblArkaPlan.setIcon(new ImageIcon("Futbol.jpg"));
        contentPane.add(lblArkaPlan);

        JLabel lblArkaPlan2 = new JLabel();
        lblArkaPlan2.setBounds(-10, 0, 1500, 800);
        lblArkaPlan2.setIcon(new ImageIcon("Basketbol.jpg"));
        contentPane.add(lblArkaPlan2);

        Timer myTimer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                lbl_skor1.setText("" + Test.kullanici.skorGoster());
                lbl_skor2.setText("" + Test.bilgisayar.skorGoster());
                lblDurum.setText(oyunDurum);
                lblPozisyon.setText(pozisyonBilgisi);
                if (Kullanici.sayac % 2 == 0) {
                    sira = "futbolcu";
                    lbl1.setText("Futbolcu");
                } else {
                    lbl1.setText("Basketbolcu");
                    sira = "basketbolcu";
                }
                if (lblDurum.getText() == "Berabere") {
                    if (sira == "basketbolcu" && Bilgisayar.bSecilenFutbolcu.size() != 0) {
                        futbolcuButtons.get(Kullanici.futbolcuSec).setEnabled(true);

                    } else if (sira == "basketbolcu" && Bilgisayar.bSecilenFutbolcu.size() == 0)
                        basketbolcuButtons.get(Kullanici.basketbolcuSec).setEnabled(true);

                    else if (sira == "futbolcu" && Bilgisayar.bSecilenBasketbolcu.size() != 0) {
                        basketbolcuButtons.get(Kullanici.basketbolcuSec).setEnabled(true);
                    } else if (sira == "futbolcu" && Bilgisayar.bSecilenBasketbolcu.size() == 0)
                        futbolcuButtons.get(Kullanici.futbolcuSec).setEnabled(true);
                }

                if (sira == "futbolcu") {
                    lblArkaPlan2.setVisible(false);
                    lblArkaPlan.setVisible(true);
                    contentPane.setBackground(new Color(0, 51, 51));
                } else {
                    lblArkaPlan.setVisible(false);
                    lblArkaPlan2.setVisible(true);
                    contentPane.setBackground(new Color(178, 34, 34));
                }
            }
        };

        myTimer.schedule(task, 0, 100);
        for (int i = 0; i < Test.futbolcuList.size() / 2; i++) {
            futbolcuButtons.get(i).addActionListener(this);
            basketbolcuButtons.get(i).addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean buldum = false;
        if (sira == "futbolcu") {
            for (int i = 0; i < Test.futbolcuList.size() / 2; i++) {
                if (e.getActionCommand() == Test.futbolcuList.get(Oyuncu.secilenFutbolcu.get(i)).getSporcuIsim()) {
                    Kullanici.futbolcuSec = i;
                    buldum = true;
                }
            }
            if (buldum) {
                futbolcuButtons.get(Kullanici.futbolcuSec).setEnabled(false);
                futbolcuSecim = false;
                btn9.setIcon(Test.futbolcuList.get(Oyuncu.bSecilenFutbolcu.get(Bilgisayar.bSec)).getImageIcon());
            }
        }

        if (sira == "basketbolcu") {
            for (int i = 0; i < Test.basketbolcuList.size() / 2; i++) {
                if (e.getActionCommand() == Test.basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(i)).getSporcuIsim()) {
                    Kullanici.basketbolcuSec = i;
                    buldum = true;
                }
            }
            if (buldum) {
                basketbolcuButtons.get(Kullanici.basketbolcuSec).setEnabled(false);
                basketbolcuSecim = false;
                btn9.setIcon(Test.basketbolcuList.get(Oyuncu.bSecilenBasketbolcu.get(Bilgisayar.bSec)).getImageIcon());
            }
        }
    }
}
