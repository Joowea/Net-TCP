import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.0.105",8882);

        OutputStream sos = socket.getOutputStream();

        sos.write("客户端：你好服务器".getBytes());

        InputStream sis = socket.getInputStream();

        byte[] bytes = new byte[10];
        int len = 0;
        while((len = sis.read(bytes))!=-1){

            System.out.print(new String(bytes,0,len));
        }




        socket.close();
    }
}
