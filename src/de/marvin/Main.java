package de.marvin;


import java.io.*;

public class Main {

    public static void main(String[] args) {
        byte[] b = {'h', 'e', 'l', 'l', 'o','.','w','o','r','l','d'};

        try {

            // create a new output stream named test
            OutputStream os = new FileOutputStream("test.txt");

            // craete a new input stream from test
            InputStream is = new FileInputStream("test.txt");

            // write something into test
            os.write(b);

            // read what is written into test
            for (int i = 0; i < b.length; i++) {
                System.out.print("" + (char) is.read());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}