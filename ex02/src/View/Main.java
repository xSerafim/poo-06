package View;

import Controller.FuncionarioIntegralController;
import Controller.FuncionarioMeioPeriodoController;
import Controller.FuncionarioTemporarioController;
import Model.FuncionarioIntegral;
import Model.FuncionarioMeioPeriodo;
import Model.FuncionarioTemporario;

public class Main {
  public static void main(String[] args) {
    FuncionarioIntegralController funcIntegral = new FuncionarioIntegralController();
    FuncionarioIntegral f1 = funcIntegral.contratacao();

    System.out.printf("Funcionário contratado: %d, %s, %.2f\n",
        f1.getId(),
        f1.getNome(),
        f1.getSalario());

    FuncionarioMeioPeriodoController funcMeioPeriodo = new FuncionarioMeioPeriodoController();
    FuncionarioMeioPeriodo f2 = funcMeioPeriodo.contratacao();

    System.out.printf("Funcionário contratado: %d, %s, %.2f\n",
        f2.getId(),
        f2.getNome(),
        f2.getSalario());

    FuncionarioTemporarioController funcTemporario = new FuncionarioTemporarioController();
    FuncionarioTemporario f3 = funcTemporario.contratacao();

    System.out.printf("Funcionário contratado: %d, %s, %.2f, %d/%d/%d\n",
        f3.getId(),
        f3.getNome(),
        f3.getSalario(),
        f3.getDiaVencimentoContrato(),
        f3.getMesVencimentoContrato(),
        f3.getAnoVencimentoContrato());

  }
}
