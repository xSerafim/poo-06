package Model;

public class FuncionarioMeioPeriodo extends Funcionario {
  private int horaEntrada;
  private int horaSaida;

  public FuncionarioMeioPeriodo() {
    super();
  }

  public int getHoraEntrada() {
    return horaEntrada;
  }

  public void setHoraEntrada(int horaEntrada) {
    this.horaEntrada = horaEntrada;
  }

  public int getHoraSaida() {
    return horaSaida;
  }

  public void setHoraSaida(int horaSaida) {
    this.horaSaida = horaSaida;
  }
}
