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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
