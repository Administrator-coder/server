package com.example.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TCPserver extends Thread
{
    private ServerSocket serverSocket;
    private SQLiteserver sql;
    public Socket socket;
    public TCPserver(int port) throws IOException
    {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }
    public void run()
    {
        while(true)
        {
            try
            {
                socket = serverSocket.accept();
                System.out.println("连接成功");
                break;
            }
            catch(SocketTimeoutException e)
            {
                System.out.println("连接超时");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        sql = new SQLiteserver();
        action();
    }
    public void action()
    {

    }

}