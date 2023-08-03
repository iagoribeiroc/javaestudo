// OPERADORES RELACIONAIS

/*
 (==) UMA IGUAL OUTRA
 (!=) DIFERENTE
 (>) MAIOR QUE
 (<) MENOR QUE
 (>=) MAIOR OU IGUAL
 (<= MENOR OU IGUAL)
 */

public class Operadores04 {

  public static void main(String[] args) {
    int notaAluno = 4;

    if (notaAluno >= 6) System.out.println("Aluno aprovado"); else if (
      notaAluno == 5
    ) System.out.println("Aluno em recuperação"); else System.out.println(
      "Aluno reprovado"
    );
  }
}
