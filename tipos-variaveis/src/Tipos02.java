//DIFERENÇA VARIAVEL E CONSTANTE

// ADICIONAR FINAL ANTES DA VARIAVEL PARA NÃO PERMITIR ALTERAÇÃO

public class Tipos02 {

  public static void main(String[] args) {
    int idadeIago = 26;

    idadeIago = 23;

    final int IDADE_GABI = 22;

    // idadeGabi = 45; - ERRO AO COLOCAR

    System.out.println(idadeIago + " " + IDADE_GABI);
  }
}
