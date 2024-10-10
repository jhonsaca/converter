package com.converter.main;

import com.converter.models.Converter;
import com.converter.models.Money;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Definición de variables
        Scanner entry = new Scanner(System.in);
        Converter converter = new Converter();
        Money money;
        var amount = 0.00;
        //Inicio del sistema
        System.out.println("Bienvenido al sistema de conversión de divisas");
        //Variable controladora del bucle
        boolean program = true;
        //Bucle principal del programa
        while (program == true){
            // Funcionamiento del sistema
            System.out.println("Ingrese la opción que desee realizar");
            System.out.println("1. Dólares (USD) - Pesos Argentinos (ARS)");
            System.out.println("2. Pesos Argentinos (ARS) - Dólares (USD)");
            System.out.println("3. Dólares (USD) - Reales Brasileños (BRL)");
            System.out.println("4. Reales Brasileños (BRL) - Dólares (USD)");
            System.out.println("5. Dólares (USD) - Pesos Colombianos (COP)");
            System.out.println("6. Pesos Colombianos (COP) - Dólares (USD)");
            System.out.println("7. Salir");
            //Arbol de decisión
            switch (entry.nextInt()){
                case 1:
                    System.out.println("Ingrese el monto a convertir");
                    amount = entry.nextDouble();
                    money = converter.convert("USD", "ARS", amount);
                    System.out.println(money);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a convertir");
                    amount = entry.nextDouble();
                    money = converter.convert("ARS", "USD", amount);
                    System.out.println(money);
                    break;
                case 3:
                    System.out.println("Ingrese el monto a convertir");
                    amount = entry.nextDouble();
                    money = converter.convert("USD", "BRL", amount);
                    System.out.println(money);
                    break;
                case 4:
                    System.out.println("Ingrese el monto a convertir");
                    amount = entry.nextDouble();
                    money = converter.convert("BRL", "USD", amount);
                    System.out.println(money);
                    break;
                case 5:
                    System.out.println("Ingrese el monto a convertir");
                    amount = entry.nextDouble();
                    money = converter.convert("USD", "COP", amount);
                    System.out.println(money);
                    break;
                case 6:
                    System.out.println("Ingrese el monto a convertir");
                    amount = entry.nextDouble();
                    money = converter.convert("COP", "USD", amount);
                    System.out.println(money);
                    break;
                case 7:
                    program = false;
                    break;
            }
        }
    }
}
