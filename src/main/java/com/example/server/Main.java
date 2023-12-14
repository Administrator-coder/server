package com.example.server;

import java.io.IOException;

public class Main{

    public static void main(String[] args) {
        try
        {
            TCPserver s = new TCPserver(666);
            s.run();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
