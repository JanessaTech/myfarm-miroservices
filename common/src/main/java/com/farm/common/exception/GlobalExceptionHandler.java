package com.farm.common.exception;

import com.farm.common.FarmResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Handle global exceptions here
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity exception(MethodArgumentNotValidException ex){
        Map<String, String> errors = new HashMap<String, String>();
        ex.getAllErrors().forEach( error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        FarmResponse response = FarmResponse.fail(HttpStatus.BAD_REQUEST, errors);
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity exception(ConstraintViolationException ex){
        Map<String, String> errors = new HashMap<>();
        ex.getConstraintViolations().forEach(error -> {
            String path = error.getPropertyPath().toString();
            //System.out.println("path:" + path);
            int index = path.indexOf(".");
            String key = path.substring(index + 1);
            errors.put(key, error.getMessage());
        });
        FarmResponse response = FarmResponse.fail(HttpStatus.BAD_REQUEST, errors);
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ResponseEntity exception(MissingServletRequestParameterException ex){
        Map<String,String> error = new HashMap<>();
        error.put(ex.getParameterName(), ex.getMessage());
        FarmResponse response = FarmResponse.fail(HttpStatus.BAD_REQUEST, error);
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }
}