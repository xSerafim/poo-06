package Model;

public class Motor {
  private int qntdPist;
  private int potencia;

  public Motor() {
    super();
  }

  public int getQntdPist() {
    return qntdPist;
  }

  public final void setQntdPist(int qntdPist) {
    this.qntdPist = qntdPist;
  }

  public int getPotencia() {
    return potencia;
  }

  public final void setPotencia(int potencia) {
    this.potencia = potencia;
  }
}
