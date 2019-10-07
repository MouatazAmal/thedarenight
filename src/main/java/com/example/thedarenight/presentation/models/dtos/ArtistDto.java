package com.example.thedarenight.presentation.models.dtos;

import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArtistDto {

  private Long id;

  private String artistName;

  private List<String> genres;

  private String location;

  private String facebookLink;

  private String soundcloudLink;

  private String instagramLink;

  private List<String> photosLink;
}
