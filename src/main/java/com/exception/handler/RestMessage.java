package com.exception.handler;



public class RestMessage {


    private String message;

    private Boolean status;

    private Object object;


    public RestMessage(String message){
        this.message = message;
        this.status = false;
        this.object = null;
    }
}
