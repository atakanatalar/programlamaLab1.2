import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class BitisEkrani extends JFrame {

    private JPanel contentPane;

    public void main(String isim) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BitisEkrani frame = new BitisEkrani(isim);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BitisEkrani(String isim) {
        setBackground(SystemColor.lightGray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(420, 100, 600, 600);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.lightGray);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbl_oyunDurum = new JLabel("");
        lbl_oyunDurum.setFont(new Font("MV Boli", Font.PLAIN, 50));
        lbl_oyunDurum.setBounds(50, 10, 600, 70);
        if (Test.bilgisayar.skorGoster() > Test.kullanici.skorGoster())
            lbl_oyunDurum.setText("Maalesef Kaybettiniz");
        else if (Test.bilgisayar.skorGoster() == Test.kullanici.skorGoster())
            lbl_oyunDurum.setText("  Berabere Kaldýnýz  ");
        else
            lbl_oyunDurum.setText("Tebrikler Kazandýnýz");
        contentPane.add(lbl_oyunDurum);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setFont(new Font("MV Boli", Font.PLAIN, 40));
        lblNewLabel.setBounds(35, 110, 300, 50);
        lblNewLabel.setText(isim);
        contentPane.add(lblNewLabel);

        JLabel lblBilgisayar = new JLabel("Bilgisayar");
        lblBilgisayar.setFont(new Font("MV Boli", Font.PLAIN, 40));
        lblBilgisayar.setBounds(315, 440, 300, 50);
        contentPane.add(lblBilgisayar);

        JLabel lbl_kSkor = new JLabel("0");
        lbl_kSkor.setFont(new Font("MV Boli", Font.PLAIN, 40));
        lbl_kSkor.setBounds(235, 110, 69, 50);
        lbl_kSkor.setText("" + Test.kullanici.skorGoster());
        contentPane.add(lbl_kSkor);

        JLabel lbl_bSkor = new JLabel("0");
        lbl_bSkor.setFont(new Font("MV Boli", Font.PLAIN, 40));
        lbl_bSkor.setBounds(515, 445, 69, 50);
        lbl_bSkor.setText("" + Test.bilgisayar.skorGoster());
        contentPane.add(lbl_bSkor);

        JLabel lblArkaPlanBitis = new JLabel();
        lblArkaPlanBitis.setBounds(0, 0, 600, 600);
        lblArkaPlanBitis.setIcon(new ImageIcon("bitisEkrani.png"));
        contentPane.add(lblArkaPlanBitis);

    }
}
