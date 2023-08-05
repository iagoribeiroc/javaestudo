// operadores lógicos

/*
 (&&) - E
 (||) - OU
 */

public class Operadores05 {

  public static void main(String[] args) {
    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2) {
      System.out.println("As duas são verdadeiras");
    }

    if (condicao1 || condicao2) {
      System.out.println("Uma das condições é verdadeiras");
    }

    System.out.println("Fim");
  }
}
