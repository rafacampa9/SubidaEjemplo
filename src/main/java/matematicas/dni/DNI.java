/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package matematicas.dni;

import java.util.Scanner;

/**
 *
 * @author rafacampa9
 */
public class DNI {

    public static void main(String[] args) {
        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author rafacampa9
 */
        int dni = 0;
        System.out.println ("Introduzca su DNI: ");
        Scanner teclado = new Scanner (System.in);
        dni = teclado.nextInt();
        while (dni < 10000000 || dni > 99999999){
            System.out.println ("Error. Introduzca su dni de nuevo. ");
            dni = teclado.nextInt();
            
        }
        int id_letra = dni%23;
        char letra;
        
        switch (id_letra){
            case 0:
                letra = 'T';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 1:
                letra = 'R';
                System.out.println ("La letra de su DNI es: " + letra);
                break;
            case 2:
                letra = 'W';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 3:
                letra = 'A';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 4:
                letra = 'G';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 5:
                letra = 'M';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 6:
                letra = 'Y';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 7:
                letra = 'F';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 8:
                letra = 'P';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 9:
                letra = 'D';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 10:
                letra = 'X';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 11:
                letra = 'B';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 12:
                letra = 'N';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 13:
                letra = 'J';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 14:
                letra = 'Z';
                System.out.println ("La letra de su DNI es: " + letra);
                break;
            case 15:
                letra = 'S';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 16:
                letra ='Q';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 17:
                letra = 'V';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 18:
                letra = 'H';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 19:
                letra = 'L';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 20:
                letra = 'C';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 21:
                letra = 'K';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
            case 22:
                letra = 'E';
                System.out.println ("La letra de su DNI es: " + letra );
                break;
        }
    }
}

 
