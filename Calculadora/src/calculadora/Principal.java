package Calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Trigonometrica trigC = new Trigonometrica();
        int option = 0;
        int continuar = 0;
        do {
            System.out.println("Seleccione el tipo de operación:");
            System.out.println("1->suma");
            System.out.println("2->resta");
            System.out.println("3->seno");
            System.out.println("4->coseno");
            Scanner myS = new Scanner(System.in);
            Scanner opt = new Scanner(System.in);

            try {
                option = myS.nextInt();
            } catch (Exception ex) {
                System.out.println("Datos no validos, debe ser numerico.");
            }
            switch (option) {
                case 1:
                    System.out.println("Ingrese X:");

                    try {
                        cal.setX(myS.nextDouble());
                    } catch (Exception ex) {
                        System.out.println("Datos no validos.");
                        break;
                    }
                    System.out.println("Ingrese Y:");
                    try {
                        cal.setY(myS.nextDouble());
                    } catch (Exception ex) {
                        System.out.println("Datos no validos.");
                        break;
                    }
                    cal.sumar();
                    System.out.println(cal.getR());
                    break;
                case 2:
                    System.out.println("Ingrese X:");
                    try {
                        cal.setX(myS.nextDouble());
                    } catch (Exception ex) {
                        System.out.println("Datos no validos.");
                        break;
                    }
                    System.out.println("Ingrese Y:");
                    try {
                        cal.setY(myS.nextDouble());
                    } catch (Exception ex) {
                        System.out.println("Datos no validos.");
                        break;
                    }
                    cal.restar();
                    System.out.println(cal.getR());
                    break;
                case 3:
                    System.out.println("Ingrese X:");
                    try {
                        cal.setX(myS.nextDouble());
                    } catch (Exception ex) {
                        System.out.println("Datos no validos.");
                        break;
                    }
                    trigC.seno();
                    System.out.println(trigC.getR());
                    break;
                case 4:
                    System.out.println("Ingrese X:");
                    try {
                        cal.setX(myS.nextDouble());
                    } catch (Exception ex) {
                        System.out.println("Datos no validos.");
                        break;
                    }
                    trigC.coseno();
                    System.out.println(trigC.getR());
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;

            }
            System.out.println("Dijite '1' para continuar, cualquier otra cosa para salir: ");
            try {
                continuar = opt.nextInt();
            } catch (Exception ex) {
                continuar = 0;
            }
        } while (continuar == 1);

    }

}
