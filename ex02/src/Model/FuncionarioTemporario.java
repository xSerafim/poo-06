package Model;

public class FuncionarioTemporario extends Funcionario {
  private int diaVencimentoContrato;
  private int mesVencimentoContrato;
  private int anoVencimentoContrato;

  public FuncionarioTemporario() {
    super();
  }

  public int getDiaVencimentoContrato() {
    return diaVencimentoContrato;
  }

  public void setDiaVencimentoContrato(int diaVencimentoContrato) {
    this.diaVencimentoContrato = diaVencimentoContrato;
  }

  public int getMesVencimentoContrato() {
    return mesVencimentoContrato;
  }

  public void setMesVencimentoContrato(int mesVencimentoContrato) {
    this.mesVencimentoContrato = mesVencimentoContrato;
  }

  public int getAnoVencimentoContrato() {
    return anoVencimentoContrato;
  }

  public void setAnoVencimentoContrato(int anoVencimentoContrato) {
    this.anoVencimentoContrato = anoVencimentoContrato;
  }
}
