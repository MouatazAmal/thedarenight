package com.example.thedarenight.presentation.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundArtistException extends RuntimeException {

  public NotFoundArtistException(Long id) {
    super("This artist is not Found : " + id);
  }
}
