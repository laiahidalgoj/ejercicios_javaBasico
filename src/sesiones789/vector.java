package sesiones789;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("java");
        vector.add("spring");
        vector.add("hibernate");
        vector.add("testing");
        vector.add("react");

        vector.remove(2);
        vector.remove(3);

        System.out.println(vector);
    }

    /*
    Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para
    ser añadidos al mismo.

    El problema es que cuando tú le añades valores crea un array subyacente. El tamaño son los elementos que le añades
    y la capacidad es cómo de grande es el array subyacente. Si te pasas de la capacidad del array los vectores crean
    un nuevo array copiando el array anterior y añadiendo los valores nuevos, por lo que tienen la capacidad que nosotros
    queramos.

    Ventajas: son dinámicos

    Desventajas: cuando te pasas de la capacidad del array, se crea la copia de todos los elementos y crea otra array y
    es una operación costosa a nivel computacional. Se ha de evitar realizar copias y definirle una capacidad inicial
    para evitar lentitud en el programa. Por l que se ha de crear una capacidad lo más aproximada que se pueda.

    Vector<String> vector = new Vector(1000, 10)
    el primer parámetro es la capacidad y el segundo es la capacidad de incremento
    */
}
