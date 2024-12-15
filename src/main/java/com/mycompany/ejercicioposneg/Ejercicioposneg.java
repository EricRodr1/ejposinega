/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioposneg;
import javax.swing.JOptionPane; 

/**
 *
 * @author Eric Rodriguez
 */
public class Ejercicioposneg {

    public static void main(String[] args) {
        int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar un numero, "));
        
        while (numero >= 1) {
            JOptionPane.showMessageDialog(null, "El numero es positivo");
            
            numero= Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar otro numero, "));
            
            
        while (numero <= -1) {
            JOptionPane.showMessageDialog(null, "El numero es negativo");
            
            numero= Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar otro numero, "));
        }
        
        
    }
    }
}
