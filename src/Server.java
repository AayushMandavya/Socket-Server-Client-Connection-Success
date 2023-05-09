import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server open");
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            serverSocket.accept();
            System.out.println("Client is connected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}