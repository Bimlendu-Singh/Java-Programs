import java.net.*;
import java.io.*;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader input;

    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");
            clientSocket = serverSocket.accept();
            System.out.println("Client accepted");

            // Initialize input stream
            input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);

                if (line.equals("Over")) {
                    break;
                }
            }

            System.out.println("Closing connection");

            // Close resources
            input.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
