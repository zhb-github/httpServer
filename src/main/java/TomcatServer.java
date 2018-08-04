import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 鸠摩智
 * @dec
 */
public class TomcatServer {


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {

            // 监听客户端的请求
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            byte[] arr = new byte[inputStream.available()];
            inputStream.read(arr);
            String s = new String(arr);
            System.out.println(s);
        }

    }

}
