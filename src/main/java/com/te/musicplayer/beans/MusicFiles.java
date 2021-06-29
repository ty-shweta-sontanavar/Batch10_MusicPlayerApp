package com.te.musicplayer.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Music_Player")
public class MusicFiles implements Serializable {

	@Id
	@Column(name = "id")
	private int Song_ID;
	@Column
	private String Song_Title;
	@Column
	private String Artist_Name;
	@Column
	private String Album_Name;
	@Column
	private String Song_Location;
	@Column
	private String Description;

	public int getSong_ID() {
		return Song_ID;
	}

	public void setSong_ID(int song_ID) {
		Song_ID = song_ID;
	}

	public String getSong_Title() {
		return Song_Title;
	}

	public void setSong_Title(String song_Title) {
		Song_Title = song_Title;
	}

	public String getArtist_Name() {
		return Artist_Name;
	}

	public void setArtist_Name(String artist_Name) {
		Artist_Name = artist_Name;
	}

	public String getAlbum_Name() {
		return Album_Name;
	}

	public void setAlbum_Name(String album_Name) {
		Album_Name = album_Name;
	}

	public String getSong_Location() {
		return Song_Location;
	}

	public void setSong_Location(String song_Location) {
		Song_Location = song_Location;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public MusicFiles() {
		super();
	}

	public MusicFiles(int song_ID, String song_Title, String artist_Name, String album_Name, String song_Location,
			String description) {
		super();
		Song_ID = song_ID;
		Song_Title = song_Title;
		Artist_Name = artist_Name;
		Album_Name = album_Name;
		Song_Location = song_Location;
		Description = description;
	}

}
