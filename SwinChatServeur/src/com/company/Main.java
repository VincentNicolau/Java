package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code her
        try {
            ServerSocket s = new ServerSocket(8080);
            Socket c=  s.accept();
            Socket c2 = s.accept();
            InputStream is = c.getInputStream();
            int l = is.read();
            byte[] buf = new byte[l];
            is.read(buf,0,l);
            OutputStream os = c2.getOutputStream();
            os.write(l);
            os.write(buf);
            InputStream is2 = c2.getInputStream();
            is2.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
