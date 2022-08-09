package demo.Vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import demo.Modelo.VO.Consulta1VO;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz1 extends JFrame {
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel1;
    DefaultTableModel modelo;

    public Interfaz1(){
        setTitle("Consulta1");
        setSize(500,500);
        setResizable(false);

        panelg=new JPanel();
        panelg.setBackground(new Color(45,144,73));

        String[] columnas={"ID","Nombre","Apellido","Ciudad"};
        ArrayList<String[]> d=Consulta1VO.valores();
        String[][] Datos= new String[d.size()][4];

        for (int i= 0; i < d.size(); i++) {
            //String[] s=d.get(i);
            int j=0;
            for (String s: d.get(i)) {
                Datos[i][j]=s;
                j++;
            }
            
        }
        //String [][] Datos={{"","","",""},{"","","",""}};
        modelo =new DefaultTableModel(Datos, columnas);
        tabla=new JTable(modelo);

        scpanel1=new JScrollPane(tabla);
        scpanel1.setBounds(20, 20, 440, 420);
        add(scpanel1);

        add(panelg);
        setVisible(true);

    }

    
}
