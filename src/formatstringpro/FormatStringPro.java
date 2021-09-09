/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatstringpro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FormatStringPro {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    /*
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        
        System.out.format("Это число E: %-10.4f%n", Math.E);
        System.out.format("Это число PI: %10.20f%n", Math.PI);
        System.out.format(Locale.ENGLISH,"Английская локаль: %,d%n", 123456789);
        System.out.format(Locale.GERMANY,"Немецкая локаль: %,d%n", 123456789);
        System.out.format(Locale.FRENCH,"Французская локаль: %,d%n", 123456789);
        final double PI = (double)22/7;
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.print("Введите первое целое число:");
        number1 = scanner.nextInt();
        System.out.print("Введите второе целое число:");
        number2 = scanner.nextInt();
        System.out.println("------------------------------");
        System.out.printf(String.join("%n", 
                ANSI_RED,
                "Объединение строк с разделителем: ",
                "Первый номер: %1$-5d",
                "Второй номер: %2$-5d",
                "Наше число PI: %3$.20f%n",
                ANSI_RESET),number1,number2,PI);
    }
    
}
