public class Logicos {

  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;
    int num3 = 3;
    int num4 = 4;

    if (num1 > num2 && num3 < num4) {
      System.out.println("Verdadeiro!");
    } else System.out.println("Falso");
    if (num1 >= num2 || num3 < num4) {
      System.out.println("Verdadeiro!");
    } else System.out.println("Falso");
    if (num1 <= num2 && num3 == num4) {
      System.out.println("Verdadeiro!");
    } else System.out.println("Falso");
  }
}
