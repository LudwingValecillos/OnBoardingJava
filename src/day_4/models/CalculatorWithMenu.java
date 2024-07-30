package day_4.models;

import day_4.interfaces.CalculadorOperations;
import day_4.interfaces.Calculator;
import day_4.interfaces.CalculatorMenu;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu {

    private CalculadorOperations operations = new Calculator();

    private int opcion;

    public CalculatorWithMenu() {
    }

    public CalculatorWithMenu(int opcion) {
        this.operations = operations;
        this.opcion = opcion;
    }

    @Override
    public void menu() {
        System.out.println( "--- CALCULADORA --- \n"
        + "1.Sumar \n"
        + "2.Restar \n"
        + "3.Multiplicar\n"
        + "4.Dividir\n"
        + "0.Salir");
    }


    @Override
    public void ejecutarOperacion(double num1 , double num2) {
        Scanner sc = new Scanner(System.in);
        this.opcion = sc.nextInt();
        switch (this.opcion){
            case 1:
                System.out.println(this.operations.addition(num1,num2));
                break;
            case 2:
                System.out.println(this.operations.subtraction(num1,num2));
                break;
            case 3:
                System.out.println(this.operations.multiplication(num1,num2));
                break;
            case 4:
                if (num2 == 0 || num1 == 0){
                    System.out.println("No se puede dividir numeros por cero");
                }else  System.out.println(this.operations.division(num1,num2));

                break;
            default: break;
        }
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
}
