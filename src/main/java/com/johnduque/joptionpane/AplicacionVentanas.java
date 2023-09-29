package com.johnduque.joptionpane;

import javax.swing.*;

public class AplicacionVentanas {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\Jhon\\Documents\\ASDI\\SISTEMAS_DISEÑO_SW_IV\\GENERAL_CURSO\\Ejemplo_1_POO\\src\\main\\java\\com\\johnduque\\joptionpane\\Logo.png");
        /*JOptionPane.showMessageDialog(null, "Hola Mundo!", "POO", JOptionPane.QUESTION_MESSAGE, icon);*/

        String [] opciones = {"Juan", "Pedro", "Fernando"};
        String nombre = (String)JOptionPane.showInputDialog(null,
                "Seleccione una opción", "Lista de opciones",
                JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
        mostrarMensaje("Hola "+ nombre);



    }public static  void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE);
    }

}
