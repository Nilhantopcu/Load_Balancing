/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.networkprj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    private StaticLoadBalancer staticLoadBalancer;
    private DynamicLoadBalancer dynamicLoadBalancer;

    public Client(StaticLoadBalancer staticLoadBalancer, DynamicLoadBalancer dynamicLoadBalancer) {
        this.staticLoadBalancer = staticLoadBalancer;
        this.dynamicLoadBalancer = dynamicLoadBalancer;
        
    }   
        
    public void sendRequest(Request request) {
        // Send the request to both static and dynamic load balancers
        staticLoadBalancer.handleRequest(request);
        dynamicLoadBalancer.handleRequest(request);
        
    }
        public void connectAndSendRequest(String request) throws IOException {
        // Connect to load balancer
        Socket lbSocket = new Socket("localhost", 8080);
        OutputStream lbOutput = lbSocket.getOutputStream();
        lbOutput.write(request.getBytes());

        // Terminate connection with load balancer
        lbSocket.close();
}
}
        