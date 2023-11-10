/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networkprj;

/**
 *
 * @author Nilhan Topcu
 */
public class Main {
    public static void main(String[] args) {
        StaticLoadBalancer staticLoadBalancer = new StaticLoadBalancer();
        DynamicLoadBalancer dynamicLoadBalancer = new DynamicLoadBalancer();

        Server server1 = new Server("localhost", 8001);
        Server server2 = new Server("localhost", 8002);
        Server server3 = new Server("localhost", 8003);

        staticLoadBalancer.addServer(server1);
        staticLoadBalancer.addServer(server2);
        staticLoadBalancer.addServer(server3);

        dynamicLoadBalancer.addServer(server1);
        dynamicLoadBalancer.addServer(server2);
        dynamicLoadBalancer.addServer(server3);

        Client client = new Client(staticLoadBalancer, dynamicLoadBalancer);

        Request request1 = new Request(Request.Type.DIRECTORY_LISTING);
        Request request2 = new Request(Request.Type.FILE_TRANSFER);
        Request request3 = new Request(Request.Type.COMPUTATION);
        Request request4 = new Request(Request.Type.VIDEO_STREAMING);

        client.sendRequest(request1);
        client.sendRequest(request2);
        client.sendRequest(request3);
        client.sendRequest(request4);
    }
}


