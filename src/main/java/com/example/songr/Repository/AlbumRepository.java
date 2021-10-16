package com.example.songr.Repository;

import com.example.songr.model.AlbumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface AlbumRepository extends JpaRepository<AlbumModel,Long> {

    Optional<AlbumModel> findAlbumModelByTitle(String title);
}
