/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networkprj;

/**
 *
 * @author Nilhan Topcu
 */
public class Request {
    public enum Type {
        DIRECTORY_LISTING,
        FILE_TRANSFER,
        COMPUTATION,
        VIDEO_STREAMING
    }

    private Type type;

    public Request(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}

