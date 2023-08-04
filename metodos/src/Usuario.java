public class Usuario {

  public static void main(String[] args) {
    SmartTv smarTv = new SmartTv();

    smarTv.diminuirVolume();
    smarTv.diminuirVolume();
    smarTv.diminuirVolume();
    smarTv.aumentarVolume();

    System.out.println("Canal: " + smarTv.canal);
    smarTv.escolherCanal(13);

    System.out.println("TV ligada? " + smarTv.ligada);
    System.out.println("Canal: " + smarTv.canal);
    System.out.println("Volume: " + smarTv.volume);

    smarTv.ligar();
    System.out.println("Novo status-> TV ligada? " + smarTv.ligada);
  }
}
