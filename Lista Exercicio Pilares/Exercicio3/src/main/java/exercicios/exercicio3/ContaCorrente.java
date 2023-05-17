/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Exercicio 3
- Crie uma classe chamada "ContaCorrente" que herda da classe "ContaBancaria" e possui um método para 
calcular o valor do cheque especial disponível para o titular da conta.
 */
package exercicios.exercicio3;

/**
 *
 * @author allan
 */
public class ContaCorrente extends ContaBancaria{
    
    public double calcularChequeEspecial(){
       return this.getSaldo()+ 1000;
    }
}
