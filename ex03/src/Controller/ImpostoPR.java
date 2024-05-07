package Controller;

import javax.swing.JOptionPane;

public class ImpostoPR implements ICidadeImposto {
  @Override
  public float calcImposto() {
    float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite a área total do imóvel: "));
    int idadeImovel = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do imóvel: "));

    if (idadeImovel > 50) {
      return areaTotal * 5 + idadeImovel * 3;
    } else if (idadeImovel < 20) {
      return areaTotal * 5 + idadeImovel * 2;
    } else {
      return areaTotal * 5 + idadeImovel * 2.5f;
    }
  }
}
