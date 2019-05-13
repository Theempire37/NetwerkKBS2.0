import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scherm extends JFrame implements ActionListener {

    public Scherm(){

        //config
        setLayout(new GridLayout(5,10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Monitoring");

        //info
        JLabel PFsense = new JLabel("PFsense: ");
        add(PFsense);
        JLabel beschikbaar = new JLabel("OFFLINE");
        add(beschikbaar);



        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
