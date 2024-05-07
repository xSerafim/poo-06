package Controller;

import javax.swing.JOptionPane;

import Model.FuncionarioTemporario;

public class FuncionarioTemporarioController implements IFuncionarioController {

  @Override
  public FuncionarioTemporario contratacao() {
    int id = Integer.parseInt(JOptionPane.showInputDialog("Insira seu id"));
    String nome = JOptionPane.showInputDialog("Insira seu nome");
    float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira seu salário."));
    int diaVencimentoContrato = Integer
        .parseInt(JOptionPane.showInputDialog("Insira o dia de vencimento do contrato."));
    int mesVencimentoContrato = Integer
        .parseInt(JOptionPane.showInputDialog("Insira o mês de vencimento do contrato."));
    int anoVencimentoContrato = Integer
        .parseInt(JOptionPane.showInputDialog("Insira o ano de vencimento do contrato."));

    FuncionarioTemporario f = new FuncionarioTemporario();
    f.setId(id);
    f.setNome(nome);
    f.setSalario(salario);
    f.setDiaVencimentoContrato(diaVencimentoContrato);
    f.setMesVencimentoContrato(mesVencimentoContrato);
    f.setAnoVencimentoContrato(anoVencimentoContrato);

    return f;
  }

}
