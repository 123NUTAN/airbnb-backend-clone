package com.spring.projects.airBnbApp.advice;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
public class ApiError<T> {

    private HttpStatus status;
    private String message;
    private List<String> subErrors;
}
