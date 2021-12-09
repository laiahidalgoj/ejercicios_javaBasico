package ejercicio4;

import java.io.PrintStream;

public class SmartWatch extends SmartDevice{

    public SmartWatch(double pulgadas, String modelo, String marca, double price, String procesador, String sistOperativo, String memory, boolean bluetooth) {
        super(pulgadas, modelo, marca, price, procesador, sistOperativo, memory, bluetooth);
    }

    public void mostrarDatos() {
        PrintStream var10000 = System.out;
        double var10001 = this.getPulgadas();
        var10000.println("Pulgadas: " + var10001 + "\nModelo: " + this.getModelo() + "\nMarca: " + this.getMarca() + "\nPrice: " + this.getPrice() + "\nProcesador: " + this.getProcesador() + "\nSistema Operativo: " + this.getSistOperativo() + "\nMemoria: " + this.getMemory() + "\nBluetooth: " + this.getBluetooth());
    }
}
