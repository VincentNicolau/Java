package com.company;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            ServerSocket s = new ServerSocket(8080);
            Socket c=  s.accept();

            InputStream is= c.getInputStream();
            int l = is.read();
            byte[] buf = new byte[l];
            is.read(buf,0,l);
            String tmp = new String(buf);
            System.out.println(tmp);
            System.out.println(l);
            System.out.println(s);
            System.out.println(c);
            c.close();
            s.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
