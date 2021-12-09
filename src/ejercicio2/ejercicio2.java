package ejercicio2;

public class ejercicio2 {

    public static void main(String[] args) {

        System.out.println("El resultado es " + iva(30));
    }


    static double iva (double precio){
        double resultado = precio * 21 / 100;
        double precioIva = resultado + precio;
        return precioIva;
    }
}
