import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class BaslangicEkrani extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    static String isim;

    /**
     * Launch the application.
     */
    public void ekran() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BaslangicEkrani frame = new BaslangicEkrani();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BaslangicEkrani() {
        setTitle("Sporcu Kart Oyunu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(390, 200, 663, 390);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.lightGray);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Sporcu Kart Oyunu");
        lblNewLabel.setForeground(Color.black);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setFont(new Font("MV Boli", Font.ITALIC, 45));
        lblNewLabel.setBounds(10, 10, 629, 68);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("Baslat");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isim = textField.getText();
                if (isim.isEmpty())
                    isim = "Kullanici";
                OyunEkrani oyunEkrani = new OyunEkrani(isim);
                oyunEkrani.setVisible(true);
                setVisible(false);
            }
        });
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(UIManager.getColor("Button.shadow"));
        btnNewButton.setFont(new Font("MV Boli", Font.BOLD, 20));
        btnNewButton.setBounds(270, 186, 150, 53);
        contentPane.add(btnNewButton);

        textField = new JTextField();
        textField.setFont(new Font("MV Boli", Font.PLAIN, 20));
        textField.setBounds(270, 140, 150, 29);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Isim:");
        lblNewLabel_1.setFont(new Font("MV Boli", Font.PLAIN, 24));
        lblNewLabel_1.setBounds(205, 140, 86, 25);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Yasin Çalýskan");
        lblNewLabel_2.setFont(new Font("MV Boli", Font.PLAIN, 25));
        lblNewLabel_2.setBounds(260, 285, 212, 29);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Atakan Atalar");
        lblNewLabel_2_1.setFont(new Font("MV Boli", Font.PLAIN, 25));
        lblNewLabel_2_1.setBounds(260, 324, 212, 29);
        contentPane.add(lblNewLabel_2_1);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_3.setIcon(new ImageIcon("baslangicEkrani.png"));
        lblNewLabel_3.setBounds(360, 70, 300, 340);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_4.setIcon(new ImageIcon("baslangicEkrani2.png"));
        lblNewLabel_4.setBounds(0, 70, 300, 340);
        contentPane.add(lblNewLabel_4);
    }
}
