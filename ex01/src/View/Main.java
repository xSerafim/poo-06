package View;

import Model.Carga;
import Model.Motor;
import Model.Passeio;

public class Main {
  public static void main(String[] args) {
    Motor motorPasseio = new Motor();
    motorPasseio.setQntdPist(4);
    motorPasseio.setPotencia(100);

    Motor motorCarga = new Motor();
    motorCarga.setQntdPist(6);
    motorCarga.setPotencia(200);

    Passeio passeio1 = new Passeio();
    passeio1.setPlaca("ABC1234");
    passeio1.setMarca("Chevrolet");
    passeio1.setModelo("Cruze");
    passeio1.setCor("Prata");
    passeio1.setVelocMax(200);
    passeio1.setQtdRodas(4);
    passeio1.setMotor(motorPasseio);
    passeio1.setQtdPassageiros(5);

    Passeio passeio2 = new Passeio();
    passeio2.setPlaca("DEF5678");
    passeio2.setMarca("Fiat");
    passeio2.setModelo("Uno");
    passeio2.setCor("Vermelho");
    passeio2.setVelocMax(180);
    passeio2.setQtdRodas(4);
    passeio2.setMotor(motorPasseio);
    passeio2.setQtdPassageiros(4);

    Carga carga1 = new Carga();
    carga1.setPlaca("GHI9012");
    carga1.setMarca("Volkswagen");
    carga1.setModelo("Delivery");
    carga1.setCor("Branco");
    carga1.setVelocMax(150);
    carga1.setQtdRodas(6);
    carga1.setMotor(motorCarga);
    carga1.setCargaMax(10000);
    carga1.setTara(5000);

    Carga carga2 = new Carga();
    carga2.setPlaca("JKL3456");
    carga2.setMarca("Mercedes-Benz");
    carga2.setModelo("Actros");
    carga2.setCor("Azul");
    carga2.setVelocMax(120);
    carga2.setQtdRodas(8);
    carga2.setMotor(motorCarga);
    carga2.setCargaMax(20000);
    carga2.setTara(8000);

    System.out.printf(
        "Passeio 1\nPlaca: %s\nMarca: %s\nModelo: %s\nCor: %s\nVelocidade Máxima: %.2f\nQuantidade de Rodas: %d\nQuantidade de Passageiros: %d\nQuantidade de Pistões: %d\nPotência: %d\nVelocidade Máxima em m/s: %.2f\n\n",
        passeio1.getPlaca(), passeio1.getMarca(), passeio1.getModelo(), passeio1.getCor(), passeio1.getVelocMax(),
        passeio1.getQtdRodas(), passeio1.getQtdPassageiros(), passeio1.getMotor().getQntdPist(),
        passeio1.getMotor().getPotencia(), passeio1.calcVel(passeio1.getVelocMax()));
    System.out.printf(
        "Passeio 2\nPlaca: %s\nMarca: %s\nModelo: %s\nCor: %s\nVelocidade Máxima: %.2f\nQuantidade de Rodas: %d\nQuantidade de Passageiros: %d\nQuantidade de Pistões: %d\nPotência: %d\nVelocidade Máxima em m/s: %.2f\n\n",
        passeio2.getPlaca(), passeio2.getMarca(), passeio2.getModelo(), passeio2.getCor(), passeio2.getVelocMax(),
        passeio2.getQtdRodas(), passeio2.getQtdPassageiros(), passeio2.getMotor().getQntdPist(),
        passeio2.getMotor().getPotencia(), passeio2.calcVel(passeio2.getVelocMax()));
    System.out.printf(
        "Carga 1\nPlaca: %s\nMarca: %s\nModelo: %s\nCor: %s\nVelocidade Máxima: %.2f\nQuantidade de Rodas: %d\nCarga Máxima: %d\nTara: %d\nQuantidade de Pistões: %d\nPotência: %d\nVelocidade Máxima em m/s: %.2f\n\n",
        carga1.getPlaca(), carga1.getMarca(), carga1.getModelo(), carga1.getCor(), carga1.getVelocMax(),
        carga1.getQtdRodas(), carga1.getCargaMax(), carga1.getTara(), carga1.getMotor().getQntdPist(),
        carga1.getMotor().getPotencia(), carga1.calcVel(carga1.getVelocMax()));
    System.out.printf(
        "Carga 2\nPlaca: %s\nMarca: %s\nModelo: %s\nCor: %s\nVelocidade Máxima: %.2f\nQuantidade de Rodas: %d\nCarga Máxima: %d\nTara: %d\nQuantidade de Pistões: %d\nPotência: %d\nVelocidade Máxima em m/s: %.2f\n\n",
        carga2.getPlaca(), carga2.getMarca(), carga2.getModelo(), carga2.getCor(), carga2.getVelocMax(),
        carga2.getQtdRodas(), carga2.getCargaMax(), carga2.getTara(), carga2.getMotor().getQntdPist(),
        carga2.getMotor().getPotencia(), carga2.calcVel(carga2.getVelocMax()));
  }
}
