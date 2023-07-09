import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private final String serverAddress;
    private final int serverPort;

    public Client(String address, int port) {
        serverAddress = address;
        serverPort = port;
    }

    public void start() {
        try (
            Socket socket = new Socket(serverAddress, serverPort);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))
        ) {
            System.out.println("Connected to the server.");

            String line;
            while (!(line = input.readLine()).equals("Over")) {
                out.write(line);
                out.newLine();
                out.flush();
            }

            System.out.println("Closing the connection.");
        } catch (UnknownHostException u) {
            System.out.println("Error: Unknown host - " + u.getMessage());
        } catch (IOException i) {
            System.out.println("Error: " + i.getMessage());
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 5000);
        client.start();
    }
}
