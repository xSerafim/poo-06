package Controller;

import javax.swing.JOptionPane;

public class ImpostoMG implements ICidadeImposto {
  @Override
  public float calcImposto() {
    float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite a área total do imóvel: "));
    int numeroQuartos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de quartos do imóvel: "));

    return areaTotal * 7 + numeroQuartos * 4;
  }
}