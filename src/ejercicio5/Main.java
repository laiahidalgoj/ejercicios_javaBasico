package ejercicio5;

public class Main {

    public static void main(String[] args) {
        cocheCRUD cocheCrud = new cocheCRUDImpl();

        System.out.println(cocheCrud.save());
        System.out.println(cocheCrud.findAll());
        System.out.println(cocheCrud.delete());
    }
}
