package sesiones789;

import java.util.ArrayList;

public class arrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0 ){
                list.remove(i);
            }
        }
        System.out.println(list);








    }
}
