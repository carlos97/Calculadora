package Calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Trigonometrica trigC = new Trigonometrica();
        System.out.println("Selecciones el tipo de operación:");
        System.out.println("1->suma");
        System.out.println("2->resta");
        System.out.println("3->seno");
        System.out.println("4->coseno");
        Scanner myS = new Scanner(System.in);
        switch (myS.nextInt()) {
            case 1:
                System.out.println("Ingrese X:");
                cal.setX(myS.nextDouble());
                System.out.println("Ingrese Y:");
                cal.setY(myS.nextDouble());
                cal.sumar();
                System.out.println(cal.getR());
            case 2:
                System.out.println("Ingrese X:");
                cal.setX(myS.nextDouble());
                System.out.println("Ingrese Y:");
                cal.setY(myS.nextDouble());
                cal.restar();
                System.out.println(cal.getR());
            case 3:
                System.out.println("Ingrese X:");
                cal.setX(myS.nextDouble());
                trigC.seno();
                System.out.println(trigC.getR());
            case 4:
                System.out.println("Ingrese X:");
                cal.setX(myS.nextDouble());
                trigC.coseno();
                System.out.println(trigC.getR());
        }      
    }
}
