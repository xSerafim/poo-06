package Model;

public class FuncionarioIntegral extends Funcionario {
  private int bancoHoras;

  public FuncionarioIntegral() {
    super();
  }

  public int getBancoHoras() {
    return bancoHoras;
  }

  public void setBancoHoras(int bancoHoras) {
    this.bancoHoras = bancoHoras;
  }
}
