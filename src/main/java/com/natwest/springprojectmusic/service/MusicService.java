package com.natwest.springprojectmusic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.natwest.springprojectmusic.music.Music;
import com.natwest.springprojectmusic.repo.MusicRepo;

@Service
public class MusicService {

	private MusicRepo repo;
	
	public MusicService(MusicRepo repo) {
		this.repo = repo;
	}
	
	public Music create(Music ms) {
		return this.repo.saveAndFlush(ms);
	}
	
	public List<Music> read() {
		return this.repo.findAll();
	}
	
	public Music update(Long id, Music newMs){
		Music existing = this.repo.getById(id);
		existing.setSongName(newMs.getSongGenre());
		existing.setArtistName(newMs.getArtistName());
		existing.setYearReleased(newMs.getYearReleased());
		existing.setSongGenre(newMs.getSongGenre());
		existing.setSongLength(newMs.getSongLength());
		existing.setGotBass(newMs.isGotBass());
		
		Music updated = this.repo.save(existing);
		return updated;
	}
	
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
	}
}
