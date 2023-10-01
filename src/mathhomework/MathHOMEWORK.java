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
                System.out.println("O Calculator was closed.");
                break;
            }
        
        }
    }
}