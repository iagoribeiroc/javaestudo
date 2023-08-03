/* 
Atribuição (=)
Soma (+)
Subtração (-)
Divisão (/)
Multiplicação (*)
Módulo (%)
(++) - incremento
(--) decremento
(!) - negação - usado em valor lógico
*/

public class Operadores {

  public static void main(String[] args) {
    int numero = 5;

    numero = -numero; // a partir daqui a variavel fica com o mesmo valor, porém negativa

    System.out.println(numero);

    numero = numero * -1; // voltar a ser positivo

    System.out.println(numero);
  }
}
