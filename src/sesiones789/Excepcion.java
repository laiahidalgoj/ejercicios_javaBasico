package sesiones789;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class Excepcion {

    public static void main(String[] args) throws ArithmeticException {

        System.out.println(dividePorCero(4,0));

    }

    public static int dividePorCero(int A, int B) throws ArithmeticException {

        int resultado = 0;

        try {
            resultado = A / B;
            System.out.println("Resultado es: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally{
            System.out.println("Demo de código");
        }

        return resultado;
    }
}
