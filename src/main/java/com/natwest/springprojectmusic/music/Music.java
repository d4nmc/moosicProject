package com.natwest.springprojectmusic.music;

public class Music {

	// Create the variables
	
	private String songName;
	private String artistName;
	private int yearReleased;
	private String songGenre;
	private double songLength;
	private boolean gotBass;
	
	public Music()	{}
	
	public Music(String songName, String artistName, int yearReleased, String songGenre, double songLength,
			boolean gotBass) {
		super();
		this.songName = songName;
		this.artistName = artistName;
		this.yearReleased = yearReleased;
		this.songGenre = songGenre;
		this.songLength = songLength;
		this.gotBass = gotBass;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	public String getSongGenre() {
		return songGenre;
	}

	public void setSongGenre(String songGenre) {
		this.songGenre = songGenre;
	}

	public double getSongLength() {
		return songLength;
	}

	public void setSongLength(double songLength) {
		this.songLength = songLength;
	}

	public boolean isGotBass() {
		return gotBass;
	}

	public void setGotBass(boolean gotBass) {
		this.gotBass = gotBass;
	}
	

	
}
