package Calculadora;

import java.util.Scanner;

public class Calculadora_v2 {
     private String marca;
    private String cor;
    private double numero1;
    private double numero2;
    private double valor;      
    
   public double getNumero1(){        
        return this.numero1;
    }
   
   public double pegarNumero1(){
       return this.numero1;
   }
   
   public double getNumero2(){        
        return this.numero2;
    }
    
    public void setNumero1(){
        System.out.println("Digite o numero 1: " );
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        this.numero1 = num;
        System.out.println("O valor digitado foi: " + num);       
    }
    
    public void setNumero2(){
        System.out.println("Digite a numero 2: " );
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        this.numero2 = num;
        System.out.println("O valor digitado foi: " + num);       
    }
    
    public double soma(double n1, double n2){
        return n1+n2;
    }
    
    public double subtrair(double n1, double n2){
        return n1-n2;
    }
    
    public double multiplicar (double n1, double n2){
        return n1*n2;
    }
    
    public double dividir(double n1, double n2){
        return n1/n2;
    }
    
}
