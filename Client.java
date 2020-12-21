package Chat.TaskOne;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        new Client().start("localhost", 8189);

    }

    public void start(String localHost, int serverPort) throws IOException{
        Socket socket = null;
        Thread inThread = null;
        try {
            socket = new Socket(localHost, serverPort);
            System.out.println("Client launched");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            inThread = runIn(in);
            runOut(out);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inThread != null)
                inThread.interrupt();

            if (socket != null)
                socket.close();
        }
    }

    public Thread runIn(DataInputStream in) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String serverMessage = in.readUTF();
                    System.out.println("Server says: " + serverMessage);
                    if (serverMessage.equals("/end"))
                        System.exit(0);

                } catch (Exception e) {
                    System.out.println("Connection closed");
                    e.printStackTrace();
                    break;
                }

            }
        });
        thread.start();
        return thread;
    }


    public void runOut(DataOutputStream out) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            out.writeUTF(message);
            if (message.equals("/end"))
                break;
        }
    }
}
