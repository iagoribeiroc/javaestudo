/*
 BYTE - -128 ATÉ 127 - 1BYTE
 SHORT - -32.768 ATE 32.767 - 2BYTE
 INT - -2147483648 ATE ... - 4BYTES
 LONG - -9223372036854775808 - 8BYTES
 FLOAT - -3,4028e + 38 - 4BYTES
 DOUBLE - -1,7976e + 308 - 8BYTES
 */

public class Tipos01 {

  public static void main(String[] args) {
    byte idade = 26;
    short ano = 2023;
    int cep = 12232239; // se começar com zero, talvez seja necessário usar outro tipo
    long cpf = 12345678952L; // se começar com zero, talvez seja necessário usar outro tipo
    float pi = 3.14F;
    double salario = 1320.50;

    System.out.print(
      idade + " " + ano + " " + cep + " " + cpf + " " + pi + " " + salario
    );
  }
}
