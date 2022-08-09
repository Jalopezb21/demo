package demo.Vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import demo.Modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz2 extends JFrame {
    
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel1;
    DefaultTableModel modelo;

    public Interfaz2(){
        setTitle("Consulta2");
        setSize(500,320);        
        setResizable(false);

        panelg=new JPanel();
        panelg.setBackground(new Color(38,222,229));

        String[] columnas={"ID","Constructora","Numero_Habitaciones","Ciudad"};
        ArrayList<String[]> d=Consulta2VO.valores();
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
        scpanel1.setBounds(20, 20, 440, 230);
        add(scpanel1);

        add(panelg);
        setVisible(true);

    }

}
