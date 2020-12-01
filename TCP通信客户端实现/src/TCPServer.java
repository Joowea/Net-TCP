import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8882);

        Socket socket = server.accept();

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        byte[] bytes = new byte[1024];

        int len = is.read(bytes);

        System.out.println(new String(bytes,0,len));

        os.write("服务器：收到谢谢".getBytes());

        socket.close();
        server.close();
    }
}
