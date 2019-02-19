/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_2;

/**
 *
 * @author fojomars
 */
public class Tartaglia {
    public void trianguloTartaglia(int lineas){
        int [] linea1 = new int[1];
        for (int i = 0; i <lineas;i++){
            int[] linea2 = new int[i];
            for (int j=0;j<i;j++) {
                if (j==0 || j==(i-1)) {
                    linea2[j]=1;
                } else {
                    linea2[j]=linea1[j]+linea1[j-1];
                }
                System.out.print(linea2[j] +" ");
            }
            linea1=linea2;
            System.out.println();
        }
    }
}