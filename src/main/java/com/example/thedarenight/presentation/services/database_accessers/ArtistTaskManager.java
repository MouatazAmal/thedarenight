package com.example.thedarenight.presentation.services.database_accessers;

import com.example.thedarenight.presentation.exceptions.NotFoundArtistException;
import com.example.thedarenight.presentation.models.dtos.ArtistDto;
import com.example.thedarenight.presentation.models.entities.Artist;
import com.example.thedarenight.presentation.repositories.ArtistRepository;
import com.example.thedarenight.presentation.services.mappers.ArtistMapper;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ArtistTaskManager {

  @Autowired
  private ArtistRepository artistRepository;

  @Autowired
  private ArtistMapper artistMapper;

  public ArtistDto findArtistById(Long id){
    Artist artist = artistRepository.findById(id).orElseThrow(()->new NotFoundArtistException(id));
    return artistMapper.fromEntityToDto(artist);
  }
}
