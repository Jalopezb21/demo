package demo.Vista;
import javax.swing.*;
import java.awt.event.*;


public class InterfazPrincipal extends JFrame implements ActionListener{
    JPanel panel1;
    JButton btn1;
    JButton btn2;
    JButton btn3;

    public InterfazPrincipal(){
        setTitle("Interfaz Principal");
        setSize(500, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        btn1=new JButton("Consulta 1");
        btn1.setBounds(30, 10, 100, 40);
        btn1.addActionListener(this);
        add(btn1);

        btn2=new JButton("Consulta 2");
        btn2.setBounds(170, 10, 100, 40);
        btn2.addActionListener(this);
        add(btn2);

        btn3=new JButton("Consulta 3");
        btn3.setBounds(310, 10, 100, 40);
        btn3.addActionListener(this);
        add(btn3);

        panel1=new JPanel();
        add(panel1);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==btn1){
            new Interfaz1();
        }
        else if(e.getSource()==btn2){
            new Interfaz2(); 
        }
        else if(e.getSource()==btn3){
            new Interfaz3();
        }
    } 
  
}
