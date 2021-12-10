package sesiones789;

import java.io.*;

public class inputStream {

    public static void main(String[] args) throws IOException {

        File fileIn = new File("origen.txt");
        File fileOut = new File("destino.txt");

        leerYCopiar(fileIn, fileOut);
    }


    public static void leerYCopiar(File fileIn, File fileOut) throws IOException {

        InputStream in = new FileInputStream(fileIn);
        OutputStream out = new FileOutputStream(fileOut);

        byte[] buffer = new byte[1024];
        int len;

        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }

        in.close();
        out.close();
        System.out.println("Fichero copiado con éxito");
    }
    }
