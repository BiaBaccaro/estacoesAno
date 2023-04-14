import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.lang.Math;

public class Estacao {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int dia, mes;
        
        System.out.println("Informe o mês: ");
        mes = input.nextInt();
        System.out.println("Informe o dia: ");
        dia = input.nextInt();
        if (mes == 1 || mes == 2 || mes == 3) {
            if (mes == 3 && dia >= 20) {
                System.out.println("Outono");
            } else {
                System.out.println("Verão");
            }
            if (mes == 4 || mes == 5 || mes == 6) {
                System.out.println("Inverno");
            } else {
                System.out.println("Primavera");
              
            if (mes == 7 || mes == 8 || mes == 9) {
                System.out.println("Primavera");
            } else {
                System.out.println("Inverno");
            }
            if (mes == 10 || mes == 11 || mes == 12) {
                System.out.println("Verão");
            } else {
                System.out.println("Primavera");
            }
        }
    }
}
