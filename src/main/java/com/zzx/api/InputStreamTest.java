package main.java.com.zzx.api;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class InputStreamTest {

    public static void main(String[] args) {
        String lxs = "java";
        try {
            try (var inputStream = new ByteArrayInputStream(lxs.getBytes());
                 var outputStream = new ByteArrayOutputStream()) {
                inputStream.transferTo(outputStream);
                System.out.println(outputStream); //java
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
