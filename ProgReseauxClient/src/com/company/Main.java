package com.company;


import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean connect = false;
        Socket c = null;
        do{
            try{
                c = new Socket();
                SocketAddress remote = new InetSocketAddress("localhost",8080);
                c.connect(remote);
                connect = true;

                System.out.println(c);
                System.out.println(remote);
            }catch (IOException e){
                System.out.println(e.toString());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException Ie){
                    System.out.println(Ie.toString());
                }
            }
        }while(!connect);

        Scanner scan = new Scanner(System.in);
        String theLine = scan.nextLine();
        try {
            OutputStream os = c.getOutputStream();
            int l = theLine.getBytes().length;
            os.write(l);
            os.write(theLine.getBytes());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


        try {
            c.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
