package Controller;

import javax.swing.JOptionPane;

import Model.FuncionarioIntegral;

public class FuncionarioIntegralController implements IFuncionarioController {

  @Override
  public FuncionarioIntegral contratacao() {
    int id = Integer.parseInt(JOptionPane.showInputDialog("Insira seu id"));
    String nome = JOptionPane.showInputDialog("Insira seu nome");
    float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira seu salário."));

    FuncionarioIntegral f = new FuncionarioIntegral();
    f.setId(id);
    f.setNome(nome);
    f.setSalario(salario);

    return f;
  }
}