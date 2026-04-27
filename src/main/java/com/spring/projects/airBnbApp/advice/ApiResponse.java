package com.spring.projects.airBnbApp.advice;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {

    private LocalDateTime timeStamp;
    private T data;
    private ApiError<T> error;

    public ApiResponse() {
        this.timeStamp = LocalDateTime.now();
    }

    public ApiResponse(T data) {
        this();
        this.data= data;
    }

    public ApiResponse(ApiError<T> error) {
        this();
        this.error = error;
    }


}
