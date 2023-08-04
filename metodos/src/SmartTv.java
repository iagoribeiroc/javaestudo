public class SmartTv {

  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  // LIGAR E DESLIGAR
  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  // AUMENTAR E DIMINUIR VOLUME
  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentando volume para: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Diminuindo volume para: " + volume);
  }

  // MUDANÇA DE CANAIS
  public void escolherCanal(int novoCanal) {
    canal = novoCanal;
  }

  public void pularCanal() {
    canal++;
  }

  public void voltarCanal() {
    canal--;
  }
}
