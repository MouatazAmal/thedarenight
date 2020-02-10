package com.example.thedarenight.presentation.services.mappers;

import com.example.thedarenight.presentation.models.dtos.ArtistDto;
import com.example.thedarenight.presentation.models.entities.Artist;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class ArtistMapper {

  public ArtistDto fromEntityToDto(Artist entity){
    ArtistDto dto = new ArtistDto();
    dto.setId(entity.getId());
    dto.setArtistName(entity.getArtistName());
    dto.setGenres( entity.getGenres());
    dto.setLocation(entity.getLocation());
    dto.setFacebookLink(entity.getFacebookLink());
    dto.setSoundcloudLink(entity.getSoundcloudLink());
    dto.setInstagramLink(entity.getInstagramLink());
    dto.setPhotosLink(entity.getPhotosLink());
    return dto;
  }
}
