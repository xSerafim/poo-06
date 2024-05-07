package Controller;

import javax.swing.JOptionPane;

public class ImpostoRS implements ICidadeImposto {
  @Override
  public float calcImposto() {
    float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite a área total do imóvel: "));
    float areaGaragem = Float.parseFloat(JOptionPane.showInputDialog("Digite a área da garagem: "));

    if (areaGaragem == 0) {
      return areaTotal * 8;
    }

    return areaTotal * 7.5f + areaGaragem * 2.5f;
  }
}
