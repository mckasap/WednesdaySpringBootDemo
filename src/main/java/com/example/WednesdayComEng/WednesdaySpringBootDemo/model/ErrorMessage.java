package com.example.WednesdayComEng.WednesdaySpringBootDemo.model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
   private HttpStatus status;
   private String Message;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
