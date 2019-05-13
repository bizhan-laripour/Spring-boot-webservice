package com.exception;

public class ResponseBody {


    private Boolean status;

    private Object object;

    private String message;


    public ResponseBody(Object object , String message){
        this.object = object;
        this.message = message;
        this.status = true;
    }

    public ResponseBody(Object object){
        this.status = true;
        this.object = object;
        this.message = "success";
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
