/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathhomework;

import java.util.Scanner;

/**
 *
 * @author Ideapad320
 */
public class MathHOMEWORK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose one option:");
            System.out.println("1 - ADD");
            System.out.println("2 - Subtract");
            System.out.println("3 - Close");

            int choose = scanner.nextInt();

            if (choose == 3) {
                System.out.println(" Calculator was closed.");
                break;
            }
            
            if (choose == 1 || choose == 2) {
                System.out.print("Tell me the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Tell me the second number: ");
                double num2 = scanner.nextDouble();

                if (choose == 1) {
                    double result = ADD.calcular(num1, num2);
                    System.out.println("Result of add: " + result);
                    }
                    else {
                        double result = Subtract.calcular(num1, num2);
                        System.out.println("Result of Subtract: " + result);
                    }
             } else {
                   System.out.println("Invalid option. Please choose 1, 2 or 3.");
               }
        }       
    }
    }

