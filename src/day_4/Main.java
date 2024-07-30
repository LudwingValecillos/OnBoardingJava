package day_4;

import day_4.interfaces.CalculadorOperations;
import day_4.interfaces.CalculatorMenu;
import day_4.models.CalculatorWithMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese dos numeros");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        CalculatorWithMenu calculator = new CalculatorWithMenu();

        do {

        calculator.menu();

        calculator.ejecutarOperacion(num1,num2);

        }while ( calculator.getOpcion()!= 0);
        System.out.println("Gracias por usar calculadora");

    }
}
