package com.example.songr.Repository;

import com.example.songr.model.AlbumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PostRepository extends JpaRepository<AlbumModel,Long> {
}
