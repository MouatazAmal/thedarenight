package com.example.thedarenight.presentation.repositories;

import com.example.thedarenight.presentation.models.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
