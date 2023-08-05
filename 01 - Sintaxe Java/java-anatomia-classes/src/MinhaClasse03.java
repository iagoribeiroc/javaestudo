public class MinhaClasse03 {

  public static void main(String[] args) {
    String meuNome = "Iago";
    int minhaIdade = 26;
    String primeiroNome = "Iago";
    String segundoNome = "Ribeiro";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(
      "Meu nome é " + meuNome + " e tenho " + minhaIdade + " anos."
    );
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}
