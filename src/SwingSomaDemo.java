import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingSomaDemo extends JFrame {


    private JPanel panelMain;

    private JTextField txtN1;

    private JTextField txtN2;

    private JButton btnSoma;

    private JLabel lblResultado;

    public SwingSomaDemo() {
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int s  = n1 + n2;
                lblResultado.setText(Integer.toString(s));
            }
        });
    }

    public static void main(String[] args) {
        SwingSomaDemo h = new SwingSomaDemo();
        h.setContentPane(h.panelMain);
        h.setTitle("Swing Soma");
        h.setSize(300, 400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
