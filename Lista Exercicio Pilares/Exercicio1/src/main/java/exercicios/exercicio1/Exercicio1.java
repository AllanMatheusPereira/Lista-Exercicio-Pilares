/*
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

Exercicio 1:
Crie uma classe abstrata chamada "FormaGeometrica" com um método abstrato "calcularArea()". 
Em seguida, crie duas subclasses chamadas "Retangulo" e "Circulo" que herdam da classe "FormaGeometrica" e 
implementam o método "calcularArea()" de maneiras diferentes.
*/
package exercicios.exercicio1;

/**
 *
 * @author allan
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        System.out.println(retangulo.calcularArea(12, 5));
        Circulo circulo = new Circulo();
        System.out.println(circulo.calcularArea(24));
    }
}
