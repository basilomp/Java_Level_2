package Chat.TaskOne;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static final int SERVER_PORT = 8189;

    public static void main(String[] args) throws IOException {
        int serverPort = SERVER_PORT;
        if (args.length != 0) {
            serverPort = Integer.parseInt(args[0]);
        }
        new Server().start(serverPort);
    }

    public void start(int server_port) throws IOException {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        Thread thread = null;

        try {
            serverSocket = new ServerSocket(server_port);
            System.out.println("Server started");
            clientSocket = serverSocket.accept();
            System.out.println("Connection established");
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            thread = runThread(in);
            massSend(out);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (serverSocket != null)
                serverSocket.close();

            if (clientSocket != null)
                clientSocket.close();

            if (thread != null)
                thread.interrupt();

        }
    }

    public Thread runThread(DataInputStream in) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
            try {
                String message = in.readUTF();
                System.out.println("Client says: " + message);
                if (message.equals("/end")) {
                    System.exit(0);
                }
            } catch (IOException e) {
                System.out.println("Connection closed");
                break;
            }
            }
        });
        thread.start();
        return thread;
    }

    public void massSend(DataOutputStream out) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String reply = scanner.nextLine();
            out.writeUTF(reply);
            if (reply.equals("/end")) {
                break;

            }
        }
    }
}
