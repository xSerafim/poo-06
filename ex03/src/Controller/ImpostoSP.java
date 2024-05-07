package Controller;

import javax.swing.JOptionPane;

public class ImpostoSP implements ICidadeImposto {
  @Override
  public float calcImposto() {
    float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite a área total do imóvel: "));
    int nComodos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cômodos do imóvel: "));
    float imposto = areaTotal * 10 + nComodos * 2;

    return imposto;
  }
}
