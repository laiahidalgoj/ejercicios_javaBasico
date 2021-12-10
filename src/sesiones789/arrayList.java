package sesiones789;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();

        list.add("laia");
        list.add("fran");
        list.add("jose");
        list.add("jorge");

        System.out.println(list);

        for(String nombre : list){
            System.out.println(nombre);
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("laia");
        linkedList.add("fran");
        linkedList.add("jose");
        linkedList.add("jorge");

        for(String nombre : linkedList){
            System.out.println(nombre);
        }
    }
}
