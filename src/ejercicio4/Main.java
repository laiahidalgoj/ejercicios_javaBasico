package ejercicio4;

public class Main {

    public static void main(String[] args) {
            SmartWatch smartWatch = new SmartWatch(1.6D, "Apple Watch Series 7", "Apple", 459.0D, "Chip S7", "watchOS", "32GB", true);
            SmartPhone smartPhone = new SmartPhone(6.67D, "Mi 11i", "Xiaomi", 538.99D, "Qualcomm Snapdragon", "MIUI 12, Android 11", "8GB", true, 3, true, "2G,3G,4G,5G");
            smartPhone.mostrarDatos();
            System.out.println("------");
            smartWatch.mostrarDatos();
        }
    }
