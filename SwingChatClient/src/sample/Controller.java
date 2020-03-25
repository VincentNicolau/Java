package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;


public class Controller {

    public Controller(){
       this.c = new Socket();
        SocketAddress remote = new InetSocketAddress("localhost",8080);
        try {
            c.connect(remote);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private Socket c = null;
    @FXML
    private TextArea SendingArea;

    @FXML
    private TextArea ReceiveArea;

    @FXML
    private Button SendButton;

    @FXML
    private Button ReceiveButton;

    @FXML
    private void SendMessage(){
        try {
            String message = SendingArea.getText();
            int length = message.getBytes().length;
            OutputStream os = c.getOutputStream();
            os.write(length);
            os.write(message.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    @FXML
    private void ReceiveMessage(){
        try {
            InputStream is = c.getInputStream();
            int length = is.read();
            byte[] buf = new byte[length];
            is.read(buf,0, length);
            String message = new String(buf);
            System.out.println(message);
            ReceiveArea.appendText(message);
            OutputStream os = c.getOutputStream();
            os.write(0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
