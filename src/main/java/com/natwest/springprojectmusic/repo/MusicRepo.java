package com.natwest.springprojectmusic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.springprojectmusic.music.Music;

@Repository
public interface MusicRepo extends JpaRepository<Music, Long> {

}
