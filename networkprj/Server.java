/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networkprj;

/**
 *
 * @author Nilhan Topcu
 */


import java.net.*; 

public class Server {
    private String host;
    private int port;
    private String name;
    private int load;

    public Server(String name) {
        this.name = name;
        this.load = 0;
    }
    public Server(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
    
    
 
                         
    public void processRequest(Request request) {
        // Perform the necessary operations based on the request type
        switch (request.getType()) {
            case DIRECTORY_LISTING:
                handleDirectoryListing(request);
                break;
            case FILE_TRANSFER:
                handleFileTransfer(request);
                break;
            case COMPUTATION:
                handleComputation(request);
                break;
            case VIDEO_STREAMING:
                handleVideoStreaming(request);
                break;
            default:
                System.out.println("Invalid request type");
        }
    }

    private void handleDirectoryListing(Request request) {
        // Process the directory listing request
        System.out.println("Server: " + name + " - Handling directory listing request");
    }

    private void handleFileTransfer(Request request) {
        // Process the file transfer request
        System.out.println("Server: " + name + " - Handling file transfer request");
    }

    private void handleComputation(Request request) {
        // Process the computation request
        System.out.println("Server: " + name + " - Handling computation request");
    }

    private void handleVideoStreaming(Request request) {
        // Process the video streaming request
        System.out.println("Server: " + name + " - Handling video streaming request");
    }

    public int getLoad() {
        return load;
    }

    public void incrementLoad() {
        load++;
    }
}

