/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Boletin20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartaglia obx=new Tartaglia();
        int filas=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca numero de filas"));
        obx.trianguloTartaglia(filas);
    }
    
}
