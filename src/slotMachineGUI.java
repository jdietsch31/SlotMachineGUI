import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class slotMachineGUI  extends JFrame implements ActionListener {

    private JPanel paper;

    private JButton btnspin, btnclaimwinnings, btnaddcash, btnclose, btnpic1, btnpic2, btnpic3;

    private Random random;

    private Timer timer1;

    private int a = 0, b = 0, c = 0, counter, num, cash;

    private Icon iconpic1, iconpic2, iconpic3, iconpic4, iconpic5, iconpic6, iconpic7, iconpic8, iconpic9;

    private Random Random;

    private JTextField txtbalance, txtwinnings;

    private Image backimage;

    private JLabel threefruit, twofruit, threedifferentfruits;

    double prizeMoney;

    // JPanel background = new JPanel();
    //{

    //public void paint(Graphics g)
    //{

    // g.drawImage(backimage, 0, 0, getSize().width, getSize().height, this);

    // super.paint(g);

    // }

    //};


    public static void main(String[] args) {


        slotMachineGUI electronicbandit = new slotMachineGUI();

        electronicbandit.setVisible(true);

    }

    public slotMachineGUI() {





        JOptionPane.showMessageDialog(null, "Welcome to the Slot Machine!");
        setLayout(new FlowLayout());

        timer1 = new Timer(500, this);   // DEFAULTS to current actionlistener

        random = new Random();


        btnpic1 = new JButton("");

        btnpic1.setPreferredSize(new Dimension(100, 100));

        btnpic1.setBackground(Color.white);

        btnpic2 = new JButton("");

        btnpic2.setPreferredSize(new Dimension(100, 100));

        btnpic2.setBackground(Color.white);

        btnpic3 = new JButton("");

        btnpic3.setPreferredSize(new Dimension(100, 100));

        btnpic3.setBackground(Color.white);

        btnspin = new JButton("Play!");

        btnspin.setPreferredSize(new Dimension(100, 100));

        btnspin.setBackground(Color.yellow);

        btnclaimwinnings = new JButton("Cash funds");

        btnclaimwinnings.setPreferredSize(new Dimension(100, 100));

        btnclaimwinnings.setBackground(Color.green);

        btnaddcash = new JButton("Add Funds �1");

        btnaddcash.setPreferredSize(new Dimension(100, 100));

        btnaddcash.setBackground(Color.green);

        btnclose = new JButton("Close");

        btnclose.setPreferredSize(new Dimension(100, 100));

        btnclose.setBackground(Color.red);

        threefruit = new JLabel("3 Bar = �1");

        twofruit = new JLabel("2 fruits = 60p");

        threedifferentfruits = new JLabel("3 different fruits = 20p");

        // C:\Users\Terry\FRUIT where the fuit is held


        iconpic1 = new ImageIcon("Images/bars.png");

        iconpic2 = new ImageIcon("Images/bells.png");

        iconpic3 = new ImageIcon("Images/cherries.png");
        iconpic4 = new ImageIcon("Images/melons.png");
        iconpic5 = new ImageIcon("Images/oranges.png");
        iconpic6 = new ImageIcon("Images/plums.png");
        iconpic7 = new ImageIcon("Images/bananas.png");
        iconpic8 = new ImageIcon("Images/apples.png");


        txtbalance = new JTextField("Funds �");

        txtbalance.setPreferredSize(new Dimension(100, 100));

        txtwinnings = new JTextField("Winnings");

        txtwinnings.setPreferredSize(new Dimension(100, 100));


        setBackground(Color.cyan);

        setLayout(new FlowLayout());

        add(btnaddcash);

        add(btnspin);

        btnspin.setEnabled(false);

        add(btnclaimwinnings);

        add(btnclose);

        add(txtbalance);

        add(btnpic1);

        add(btnpic2);

        add(btnpic3);

        add(txtwinnings);

        add(threefruit);

        add(twofruit);

        add(threedifferentfruits);

        btnspin.addActionListener(this);

        btnaddcash.addActionListener(this);

        btnclaimwinnings.addActionListener(this);

        btnclose.addActionListener(this);


        setTitle("Slot Machine Simulator - James Dietsch");

        setSize(500, 500);




    }

    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == btnaddcash) {

            cash = cash + 100;

            txtbalance.setText("Funds �" + cash);

            //  electronicbandit.xx()    '


            if (cash >= 500) {

                btnaddcash.setEnabled(false);

                JOptionPane.showMessageDialog(null, "Cant add more funds");

            }


            if (cash <= 0) {

                btnaddcash.setEnabled(true);

            }

            if (cash >= 20) {

                btnspin.setEnabled(true);

            }

        }


        if (e.getSource() == btnspin) {

            counter = 0;

            timer1.start();

            txtbalance.setForeground(Color.red);

            cash = cash - 20;

            txtbalance.setText(cash + " ");

            if (cash <= 0) {

                btnspin.setEnabled(false);

                JOptionPane.showMessageDialog(null, "Insert more funds to play");

            }

        }

        //Add Winnings to credit (need to look at and fix)

        if (e.getSource() == btnclaimwinnings) {

            cash = cash + cash;//   ??

            JOptionPane.showMessageDialog(null, "You Have turned " + prizeMoney + " to credit");

            prizeMoney = cash;

            txtbalance.setText(cash + " ");

            txtwinnings.setText(prizeMoney + "");

        }
//THIS RUNS THE TIMER

        if (e.getSource() == timer1) {

            setIcon1();

              setIcon2();

               setIcon3();

        }


        if (e.getSource() == btnclose) {

            System.exit(0);
        }

    }


    private void setIcon1() {

        a = random.nextInt(8);

        switch (a) {
            case 0:

                btnpic1.setIcon(iconpic1);

                counter = counter + 1;

                break;
            case 1:

                btnpic1.setIcon(iconpic2);

                counter = counter + 1;

                break;
            case 2:

                btnpic1.setIcon(iconpic3);

                counter = counter + 1;


                break;


            case 3:

                btnpic1.setIcon(iconpic4);

                counter = counter + 1;

                break;

            case 4:
                btnpic1.setIcon(iconpic5);

                counter = counter + 1;

                break;

            case 5:
                btnpic1.setIcon(iconpic6);

                counter = counter + 1;

                break;

            case 6:

                btnpic1.setIcon(iconpic7);

                counter = counter + 1;

                break;
            case 7:

                btnpic1.setIcon(iconpic8);

                counter = counter + 1;

                break;

        }

        if (counter == 10)

            timer1.stop();

    }

     private void setIcon2() {

      b = random.nextInt(8);
      switch (b) {


      case 0:

                btnpic2.setIcon(iconpic1);

                counter = counter + 1;

                break;

            case 1:

                btnpic2.setIcon(iconpic2);

                counter = counter + 1;

                break;

            case 2:
                btnpic2.setIcon(iconpic3);

                counter = counter + 1;

                break;

            case 3:

                btnpic2.setIcon(iconpic4);

                counter = counter + 1;


                break;

            case 4:

                btnpic2.setIcon(iconpic5);

                counter = counter + 1;

                break;

            case 5:

                btnpic2.setIcon(iconpic6);

                counter = counter + 1;


                break;

            case 6:

                btnpic2.setIcon(iconpic7);

                counter = counter + 1;

                break;

            case 7:

                btnpic2.setIcon(iconpic8);

                counter = counter + 1;

                break;

        }

        if (counter == 10)

            timer1.stop();


    }


    private void setIcon3() {

        b = random.nextInt(8);

        switch (b) {


            case 0:

                btnpic3.setIcon(iconpic1);

                counter = counter + 1;

                break;

            case 1:

                btnpic3.setIcon(iconpic2);

                counter = counter + 1;

                break;

            case 2:
                btnpic3.setIcon(iconpic3);

                counter = counter + 1;

                break;

            case 3:

                btnpic3.setIcon(iconpic4);

                counter = counter + 1;


                break;

            case 4:

                btnpic3.setIcon(iconpic5);

                counter = counter + 1;

                break;

            case 5:

                btnpic3.setIcon(iconpic6);

                counter = counter + 1;


                break;

            case 6:

                btnpic3.setIcon(iconpic7);

                counter = counter + 1;

                break;

            case 7:

                btnpic3.setIcon(iconpic8);

                counter = counter + 1;

                break;

        }

        if (counter == 10)

            timer1.stop();


    }

}