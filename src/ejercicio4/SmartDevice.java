package ejercicio4;

public class SmartDevice {

        private double pulgadas;
        private String modelo;
        private String marca;
        private double price;
        private String procesador;
        private String sistOperativo;
        private String memory;
        private boolean bluetooth;

        public SmartDevice(double pulgadas, String modelo, String marca, double price, String procesador, String sistOperativo, String memory, boolean bluetooth) {
            this.pulgadas = pulgadas;
            this.modelo = modelo;
            this.marca = marca;
            this.price = price;
            this.procesador = procesador;
            this.sistOperativo = sistOperativo;
            this.memory = memory;
            this.bluetooth = bluetooth;
        }

        public double getPulgadas() {
            return this.pulgadas;
        }

        public String getModelo() {
            return this.modelo;
        }

        public String getMarca() {
            return this.marca;
        }

        public double getPrice() {
            return this.price;
        }

        public String getProcesador() {
            return this.procesador;
        }

        public String getSistOperativo() {
            return this.sistOperativo;
        }

        public String getMemory() {
            return this.memory;
        }

        public boolean getBluetooth() {
            return this.bluetooth;
        }
    }

