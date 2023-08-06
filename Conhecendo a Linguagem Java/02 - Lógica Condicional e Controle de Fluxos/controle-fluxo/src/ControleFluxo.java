/*
 * Switch para valores exatos e if para expressoes booleanas
 * Evitar usar o default do switch para "cases genéricos"
 * Evitar o efeito fkecha dos if's
 * Evitar muitos if's aninhados
 */

public class ControleFluxo {

  public static void main(String[] args) {
    // EXEMPLO IF-ELSE
    int notaAluno = 1;

    if (notaAluno >= 8) {
      System.out.println("Aprovado, muito bem!");
    } else if (notaAluno >= 6 && notaAluno < 8) {
      System.out.println("Aprovado, mas pode melhorar");
    } else if (notaAluno >= 4 && notaAluno < 6) {
      System.out.println("Em recuperação");
    } else {
      System.out.println("Reprovado");
    }

    //TERNÁRIO
    int idade = 18;

    String mensagem = idade >= 18 ? "Maior de idade." : "Menor de idade.";
    System.out.println(mensagem);
  }
}
