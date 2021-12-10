package sesiones789;

public class arrayBidimensional {

    public static void main(String[] args) {

        int array [][] = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.println("La posición de i es: " + i + " " + "La posición de j es: " + j);
                System.out.println("El valor del array es: " + array[i][j]);
                }
            }
        }
    }

