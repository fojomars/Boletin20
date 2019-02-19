/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_1;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Goles {

    // ARRAYS 
    int [][] goles = new int[3][3];
    int [] golesEquipo = new int[goles.length];

    
    // PEDIR NUMERO Y NOMBRE DE LOS EQUIPOS.
    public int tamañoEquipos(){
    return Integer.parseInt(JOptionPane.showInputDialog("Introducir número equipos: "));
    }
    
    String [] nomesEquipos = new String[tamañoEquipos()];     
    
    public void nomesE(){
        for(int i = 0; i < nomesEquipos.length; i ++){
            JOptionPane.showInputDialog("Introduca el nombre de los equipos: ");
        }       
    }
    
    
    // PEDIR NUMERO Y NOMBRE DE LAS JORNADAS
    public int tamañoXornadas(){
    return Integer.parseInt(JOptionPane.showInputDialog("Introducir número Xornadas: "));
    }
    
    String [] xornadas = new String[tamañoXornadas()];
    
    public void nomesX(){
        for(int i = 0; i < xornadas.length; i ++){
            JOptionPane.showInputDialog("Introduca el nombre de los equipos: ");
        }       
    }
    
    // MÉTODO PARA CREAR LA TABLA.
    public void crearTaboa(){
        for(int e=0;e<goles.length;e++){
            for(int x=0;x<goles[e].length;x++){
                goles[e][x] = Integer.parseInt(JOptionPane.showInputDialog("Goles: "));
            }   
        }
    }
    
    // MÉTODO PARA AMOSAR A TÁBOA.
    public void amosar(){
    /**
     * @param e fai referencia a equipos
     * @param x fai referencia a xornadas
    */
        for(int e=0;e<goles.length;e++){
            System.out.print("|  ");
            for(int x= 0; x < goles[e].length; x++){
                System.out.print(goles[e][x] + " ");
            }
            System.out.print(" |\n");
        }
    }
    
    // Obter unha listaxe dos equipos por orde de menor n° de goles na liga.
    
    public void calcularGolesEquipo(){
        int acumulador,e,x;
        for(e = 0;e < goles.length;e++){
            acumulador = 0;
            for(x = 0; x < goles[e].length;x++){
                acumulador = acumulador + goles[e][x];
            }
            golesEquipo[e]=acumulador;
            System.out.println("Goles totales del equipo: " + golesEquipo[e]);
        }
    }
    
//    public void ordenarMenor(){
//        int i,j,k,aux1=0,aux2=0;
//        String auxnom;
//        for (i=0;i<golesEquipo.length;i++){
//            for(j=i+1;j<golesEquipo.length;j++){
//                System.out.print("| ");
//                if(golesEquipo[i]>golesEquipo[j]){
//                    aux1=golesEquipo[i];auxnom=nomesAlumno[i];
//                    golesEquipo[i]=golesEquipo[j];nomesAlumno[i]=nomesAlumno[j];
//                    golesEquipo[j]=aux1;nomesAlumno[j]=auxnom;
//                }
//            }
//        }   
//    }
}