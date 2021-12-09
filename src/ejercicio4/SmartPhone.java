package ejercicio4;

import java.io.PrintStream;

public class SmartPhone extends SmartDevice {

    private int cameras;
    private boolean sim;
    private String networks;

    public SmartPhone(double pulgadas, String modelo, String marca, double price, String procesador, String sistOperativo, String memory, boolean bluetooth, int cameras, boolean sim, String networks) {
        super(pulgadas, modelo, marca, price, procesador, sistOperativo, memory, bluetooth);
        this.cameras = cameras;
        this.sim = sim;
        this.networks = networks;
    }

    private int getCameras() {
        return this.cameras;
    }

    private boolean getSim() {
        return this.sim;
    }

    private String getNetwork() {
        return this.networks;
    }

    public void mostrarDatos() {
        PrintStream var10000 = System.out;
        double var10001 = this.getPulgadas();
        var10000.println("Pulgadas: " + var10001 + "\nModelo: " + this.getModelo() + "\nMarca: " + this.getMarca() + "\nPrecio: " + this.getPrice() + "\nProcesador: " + this.getProcesador() + "\nSistema Operativo: " + this.getSistOperativo() + "\nMemoria: " + this.getMemory() + "\nBluetooh: " + this.getBluetooth() + "\nCámaras: " + this.getCameras() + "\nSIM: " + this.getSim() + "\nRedes: " + this.getNetwork());
    }
}

