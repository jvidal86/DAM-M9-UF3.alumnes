package sockets.exemple01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServidorStream {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        try {

            System.out.println("[SERVER] Connectant...");
            InetSocketAddress addr = new InetSocketAddress("localhost", 5557);
            serverSocket.bind(addr);

        //espera en aquest punt fins que la connexió es acceptada
        Socket newSocket = serverSocket.accept();

        System.out.println("[SERVER] Acceptant connexions");

        InputStream is = newSocket.getInputStream();
        OutputStream os = newSocket.getOutputStream();

        byte[] missatge = new byte[256];
        System.out.println("[SERVER] Missatge rebut:\n\t" + new String(missatge));


        newSocket.close();
        serverSocket.close();
        } catch (BindException e){
            System.err.println("[SERVER] Error connectant socket");
            serverSocket.close();
        }

        System.out.println("[SERVER] Finalitzat");

    }
}
