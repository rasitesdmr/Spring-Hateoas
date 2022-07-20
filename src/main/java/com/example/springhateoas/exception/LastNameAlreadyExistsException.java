package com.example.springhateoas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED,reason = "Error : lastName zaten var !")
public class LastNameAlreadyExistsException extends RuntimeException{
}
