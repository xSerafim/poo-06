package View;

import Controller.ICidadeImposto;
import Controller.ImpostoMG;
import Controller.ImpostoPR;
import Controller.ImpostoRS;
import Controller.ImpostoSP;

public class Main {
  public static void main(String[] args) {
    ICidadeImposto impostoMG = new ImpostoMG();
    System.out.println("Imposto a ser pago em MG: R$" + impostoMG.calcImposto());

    ICidadeImposto impostoRS = new ImpostoRS();
    System.out.println("Imposto a ser pago em RS: R$" + impostoRS.calcImposto());

    ICidadeImposto impostoPR = new ImpostoPR();
    System.out.println("Imposto a ser pago em PR: R$" + impostoPR.calcImposto());

    ICidadeImposto impostoSP = new ImpostoSP();
    System.out.println("Imposto a ser pago em SP: R$" + impostoSP.calcImposto());
  }
}
