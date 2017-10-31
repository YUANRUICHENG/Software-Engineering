package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

            Socket clientSocket;
            BufferedReader in;
            try {
                clientSocket =
                        new Socket("10.5.38.127", 5000);
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(),true);
                in =
                        new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedReader stdIn =
                        new BufferedReader(
                                new InputStreamReader(System.in)
                        );
                String userInput;

                for (Integer i = 0; i < 1001; i++)
                {
                    System.out.println(in.readLine());
                }
            }catch (IOException e){
                System.out.println("Shit be broke");
            }


    }


}
