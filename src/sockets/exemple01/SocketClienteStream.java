package sockets.exemple01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static  java.lang.System.*;

public class SocketClienteStream {
    public static void main(String[] args) throws IOException {
        out.println("[CLIENT] Creant socket client");
        Socket clientSocket = new Socket();

        out.println("[CLIENT] Creant connexió");
        InetSocketAddress addr = new InetSocketAddress("localhost",5557);
        clientSocket.connect(addr);

        InputStream is = clientSocket.getInputStream();

        OutputStream os = clientSocket.getOutputStream();

        Scanner sc = new Scanner(in);
        int nMissatges = Integer.parseInt(sc.nextLine());
        String msg = "Hola des de Sockets!!!!!";

        byte byMsg[] = msg.getBytes(StandardCharsets.UTF_8);
        os.write(byMsg);
        out.println("[CLIENT] Missatge enviat (" + byMsg.length + " bytes)");

        out.println("[CLIENT] Tancar socket");
        clientSocket.close();

        out.println("[CLIENT] Finalitzat");
    }
}
