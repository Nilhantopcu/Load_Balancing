/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networkprj;

/**
 *
 * @author Nilhan Topcu
 */
import java.util.ArrayList;
import java.util.List;

public class DynamicLoadBalancer {
    private List<Server> servers;

    public DynamicLoadBalancer() {
        servers = new ArrayList<>();
    }

    public void addServer(Server server) {
        servers.add(server);
    }

    public void removeServer(Server server) {
        servers.remove(server);
    }

    public void handleRequest(Request request) {
        // Find the server with the least load
        Server serverWithLeastLoad = servers.get(0);

        for (Server server : servers) {
            if (server.getLoad() < serverWithLeastLoad.getLoad()) {
                serverWithLeastLoad = server;
            }
        }

        serverWithLeastLoad.processRequest(request);
        serverWithLeastLoad.incrementLoad();
    }
}
