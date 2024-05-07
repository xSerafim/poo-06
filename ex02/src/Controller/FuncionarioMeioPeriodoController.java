package Controller;

import javax.swing.JOptionPane;

import Model.FuncionarioMeioPeriodo;

public class FuncionarioMeioPeriodoController implements IFuncionarioController {

  @Override
  public FuncionarioMeioPeriodo contratacao() {
    int id = Integer.parseInt(JOptionPane.showInputDialog("Insira seu id"));
    String nome = JOptionPane.showInputDialog("Insira seu nome");
    float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira seu salário."));

    FuncionarioMeioPeriodo f = new FuncionarioMeioPeriodo();
    f.setId(id);
    f.setNome(nome);
    f.setSalario(salario);

    return f;
  }
}
