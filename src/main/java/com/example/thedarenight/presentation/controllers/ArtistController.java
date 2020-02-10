package com.example.thedarenight.presentation.controllers;

import com.example.thedarenight.presentation.enumerations.Urls;
import com.example.thedarenight.presentation.exceptions.NullIdException;
import com.example.thedarenight.presentation.models.dtos.ArtistDto;
import com.example.thedarenight.presentation.models.entities.Artist;
import com.example.thedarenight.presentation.services.database_accessers.ArtistTaskManager;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Urls.ARTIST)
public class ArtistController {

  @Autowired
  private ArtistTaskManager artistTaskManager;

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public ArtistDto findArtist(@PathVariable Long id){
    if (Objects.isNull(id)){
      throw new NullIdException();
    }
    return artistTaskManager.findArtistById(id);
  }
//
//  @GetMapping
//  @ResponseStatus(HttpStatus.ACCEPTED)
//  public List<ArtistDto> artists(){
//    return artistTaskManager.findAllArtists();
//  }


}
