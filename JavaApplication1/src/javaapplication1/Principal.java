/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
    public static void main(String[] args){
        Calculadora cal= new Calculadora();
        cal.x=-5;
        cal.y=10;
        cal.restar();
        System.out.println(cal.r);
    }
    
}
