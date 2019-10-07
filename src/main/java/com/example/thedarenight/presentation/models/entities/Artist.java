package com.example.thedarenight.presentation.models.entities;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Artist{

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private String artistName;

    @Column
    @ElementCollection
    private List<String> genres;

    @Column
    @NotNull
    private String location;

    @Column(name = "facebook")
    private String facebookLink;

    @Column(name = "soundcloud")
    private String soundcloudLink;

    @Column(name = "Instagram")
    private String instagramLink;

    @Column
    @NotNull
    @ElementCollection
    private List<String> photosLink;

}
