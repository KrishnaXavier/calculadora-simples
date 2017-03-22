package Calculadora;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        
        /* Testes Calculadora_v1 */
        Calculadora_v1 cal = new Calculadora_v1(); 
        cal.setNumero1();
        cal.setNumero2();
        System.out.println("Soma "+cal.getNumero1()+" + "+cal.getNumero2()+" = "+cal.soma());
        System.out.println("Subtrair "+cal.getNumero1()+" - "+cal.getNumero2()+" = "+cal.subtrair());
        System.out.println("Multiplicação "+cal.getNumero1()+" * "+cal.getNumero2()+" = "+cal.multiplicar());
        System.out.println("Dividir "+cal.getNumero1()+" / "+cal.getNumero2()+" = "+cal.dividir());        
        System.out.println("pegarNumero1():  "+cal.pegarNumero1());
        
        /* Testes Calculadora_v2 */
        Calculadora_v2 cal2 = new Calculadora_v2(); 
        int entrada=0;
        while(entrada !=5){
            System.out.println("\n\nDigite a Operação: "
                    + "\n1-Soma"
                    + "\n2-Subtração"
                    + "\n3-Multiplicação"
                    + "\n-4Divisão"
                    + "\n5(ou outro valor)-Sair:");
            Scanner sc= new Scanner(System.in);            
            int num = sc.nextInt();
            
            System.out.println("Digite o valor 1:");                    
            int num1 = sc.nextInt();
            System.out.println("Digite o valor 2:");                    
            int num2 = sc.nextInt();
            
            switch (num){
                
                case 1:                    
                    System.out.println("Soma: "+cal2.soma(num1, num2));
                    break;
                    
                case 2:
                    System.out.println("Subtrair: "+cal2.subtrair(num1, num2));                    
                    break;
                        
                case 3:                    
                    System.out.println("Multiplicar: "+cal2.multiplicar(num1, num2));                    
                    break;
                
                case 4:                    
                    System.out.println("Dividir: "+cal2.dividir(num1, num2));            
                    break;
                    
            }
        }                                                        
    }
    
}
