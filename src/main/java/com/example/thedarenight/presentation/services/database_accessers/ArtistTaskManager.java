package com.example.thedarenight.presentation.services.database_accessers;

import com.example.thedarenight.presentation.exceptions.NotFoundArtistException;
import com.example.thedarenight.presentation.models.dtos.ArtistDto;
import com.example.thedarenight.presentation.models.entities.Artist;
import com.example.thedarenight.presentation.repositories.ArtistRepository;
import com.example.thedarenight.presentation.services.mappers.ArtistMapper;
import java.util.ArrayList;
import java.util.List;
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

  public List<ArtistDto> findAllArtists(){
    List<ArtistDto> dtos = new ArrayList<>();
    artistRepository.findAll().forEach(artist -> dtos.add(artistMapper.fromEntityToDto(artist)));
    return dtos;
  }
}
