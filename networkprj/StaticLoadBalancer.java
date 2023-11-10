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
import java.util.Random;

public class StaticLoadBalancer {
    private List<Server> servers;

    public StaticLoadBalancer() {
        servers = new ArrayList<>();
    }

    public void addServer(Server server) {
        servers.add(server);
    }

    public void removeServer(Server server) {
        servers.remove(server);
    }

    public void handleRequest(Request request) {
        // Select a random server from the available servers
        Random random = new Random();
        int index = random.nextInt(servers.size());
        Server server = servers.get(index);

        server.processRequest(request);
    }
}


