package com.johnduque.joptionpane;

import javax.swing.*;
import java.util.Objects;

public class AplicacionIcono {
    public static void main(String[] args) {
        Icon icon = new ImageIcon(AplicacionIcono.class.getResource("Logo.png"));

        JOptionPane.showMessageDialog(null,"Icono","POO",JOptionPane.QUESTION_MESSAGE,icon);
    }

    int numero = 100;
    byte otroNumero = (byte) numero;
}


