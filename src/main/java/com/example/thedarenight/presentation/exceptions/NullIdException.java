package com.example.thedarenight.presentation.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NullIdException extends RuntimeException {

  public NullIdException() {
    super("The sendes id is null");
  }
}
