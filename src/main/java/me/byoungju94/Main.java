package me.byoungju94;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        try (
            ServerSocket server = new ServerSocket(7388);
            Socket connection = server.accept();
            InputStream is = connection.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
        ) {
            String str = (String) ois.readObject();
            System.out.println("received str: " + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
