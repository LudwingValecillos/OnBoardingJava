package day_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        //1
//        System.out.println("Ingrese su nombre");
//        String name = sc.nextLine();
//
//        System.out.println("Ingrese su apellido");
//        String apellido = sc.nextLine();
//
//        System.out.println("Ingrese su edad");
//        int edad = sc.nextInt();
//
//        System.out.println("Nombre: " + name + ". apellido: " + apellido + ", edad: " + edad);

        //2
        bienvenida();

        //3
//        System.out.println("Ingrese tres numeros");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//
//        if(num1>num2 && num1>num3){
//            System.out.println("El numero mayor es: " + num1);
//        } else if (num2>num1 && num2>num3) {
//            System.out.println("El numero mayor es: " + num1);
//
//        }else System.out.println("El numero mayor es: " + num3);

        //4
//        int num = sc.nextInt();
//        if(num % 2 == 0){
//            System.out.println("Es par");
//        }else System.out.println("Es impar");

        //5
//        System.out.println("Ingrese dos cadena a verificar");
//
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//
//        if (a.equals(b)){ //No se utiliza el == porque apuntan al mismo espacio de memoria, asi que para comparar se usa equals
//            System.out.println("Son iguales");
//        }else System.out.println("No son iguales");

        //6
//        System.out.println("Ingrese un numero");
//        System.out.println(primo(sc.nextInt()));

        //7
        int[] array = {1, 5, 6, 8, 7, 9, 2, 3, 6, 4, 1, 2, 3, 9, 8, 10, 2, 5, 6};
//        System.out.println(sumaImpares(array));

        //8
//        numerosParesYSumaImpares(array);

        //9 y //10
//        menuCalculadora();

        //11

        bolero();

    }

    public static void bienvenida() {
        System.out.println("Bienvenido");
    }

    public static String primo(int num) {
        if (num % 2 == 0) {
            return "Es par";
        }
        return "Es impar";
    }

    public static int sumaImpares(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                suma += array[i];
            }
        }
        return suma;

    }

    public static void numerosParesYSumaImpares(int[] array) {
        int suma = 0;
        System.out.println("Numeros pares");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Suma numeros impares");
        System.out.println(sumaImpares(array));
    }

    public static void menuCalculadora() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int opcion;
        do {
            System.out.println("Que desea hacer con los numeros? " + num1 + " y " + num2 + "\n" +
                    "1. Sumar\n" +
                    "2. Restar\n" +
                    "3. Multiplicar \n" +
                    "4. Dividir\n" +
                    "0. Salir");

            opcion = sc.nextInt();
            while (opcion == 4 && (num1 == 0 || num2 == 0)) {
                System.out.println("No se pueden divir numeros por 0, vuelva ingresar los numeros");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            }

            if (opcion != 0) {
                System.out.println("Resultado: " + resultado(opcion, num1, num2));

            }

        } while (opcion != 0);
        System.out.println("Gracias por usar la calculadora");


    }

    public static int resultado(int opcion, int num1, int num2) {
        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                resultado = num1 / num2;
                break;

        }
        return resultado;
    }

    public static void bolero() {

        String nombre;
        int edad;
        int id;
        String voleto;
        int capacidad = 0;
        int opcion;
        int dineroRecaudado = 0;

        Scanner sc;
        do {
            System.out.println("\n --------------------------------------Bienvenido al bolling--------------------------\n\n" +
                    "¿Que desea hacer?\n" +
                    "1. Entrada de datos\n" +
                    "2. Capacidad disponible\n" +
                    "3. Dinero recaudado \n" +
                    "0. Cerrar sesion en el sistema");
            sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (capacidad != 500) {
                        sc = new Scanner(System.in);
                        System.out.println("Ingrese su nombre");
                        nombre = sc.nextLine();

                        System.out.println("Ingrese su edad");
                        edad = sc.nextInt();

                        if (edad >= 21) {
                            System.out.println("Ingrese su id");
                            id = sc.nextInt();

                            System.out.println("Tiene el boleto? 'si' o 'no' ");
                            sc = new Scanner(System.in);
                            if (sc.nextLine().toLowerCase().equals("si")) {
                                System.out.println("Ingrese el tipo de voleto; 'VIP' o 'normal'");
                                voleto = sc.nextLine().toLowerCase(Locale.ROOT);
                                while (!voleto.equals("vip") && !voleto.equals("normal")) {
                                    System.out.println("Ingrese un voleto valido; 'VIP' o 'normal'");
                                    voleto = sc.nextLine().toLowerCase(Locale.ROOT);
                                }
                                if (voleto.equals("vip")) {
                                    capacidad++;
                                    dineroRecaudado += 2000;
                                } else {
                                    dineroRecaudado += 1500;
                                    capacidad++;
                                }
                                System.out.println("Bienvenido");


                            } else {
                                System.out.println("Ingrese el dinero disponible");
                                int dinero = sc.nextInt();
                               if (dinero >= 1500) {
                                    System.out.println("vip o normal?");
                                    sc = new Scanner(System.in);
                                    voleto = sc.nextLine().toLowerCase(Locale.ROOT);
                                    while (!voleto.equals("vip") && !voleto.equals("normal")) {
                                        System.out.println("Ingrese un voleto valido; 'VIP' o 'normal'");
                                        voleto = sc.nextLine().toLowerCase(Locale.ROOT);
                                    }
                                    if (voleto.equals("vip")) {
                                        capacidad++;
                                        dineroRecaudado += 2000;
                                    } else {
                                        dineroRecaudado += 1500;
                                        capacidad++;
                                    }
                                    System.out.println("Bienvenido");


                                } else System.out.println("No cuenta con dinero disponible");
                            }

                        } else {
                            System.out.println("No cumple con la edad suficiente");

                        }


                    } else System.out.println("No se puede ingresar mas personas");
                    break;

                case 2:
                    System.out.println( "Capacidad disponoble ----------- " + ( 500  -capacidad));
                    break;

                case 3:
                    System.out.println("Dinero recaudado ----------" + dineroRecaudado);
                    break;
            }

        } while (opcion != 0);
        System.out.println("Hasta luego");
    }
}
