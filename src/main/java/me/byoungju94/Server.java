package me.byoungju94;

import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    protected static boolean cont = true;
    protected Socket connection = null;

    public void bootstrap() throws Exception {
        ServerSocket server = null;
        server = new ServerSocket(7388);
    }
}
