package com.te.musicplayer.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
@CrossOrigin(origins = "http://localhost:3000")
public class MusicFilesController {

	@Autowired
	private MusicFilesRepository repository;

	MusicFilesResponse resp = new MusicFilesResponse();

	@PostMapping("/add")
	public MusicFilesResponse addSongs(@RequestBody MusicFiles music) {
		if (repository.save(music) != null) {
			resp.setStatus(200);
			resp.setMessage("Song Added");
		} else {
			resp.setStatus(400);
			resp.setMessage("Invalid Data");
		}
		return resp;
	}

	@PutMapping("{id}")
	public MusicFilesResponse EditSongById(@PathVariable("id") int id, @RequestBody MusicFiles music) {
		if (repository.findById(id) != null) {
			repository.save(music);
			resp.setStatus(200);
			resp.setMessage("Song Updated");
		} else {
			resp.setStatus(400);
			resp.setMessage("Invalid Data");
		}
		return resp;
	}

	@DeleteMapping("{id}")
	public MusicFilesResponse deleteSongById(@PathVariable("id") int id, @RequestBody MusicFiles music) {
		if (repository.findById(id) != null) {
			repository.deleteById(id);
			resp.setStatus(200);
			resp.setMessage("Song Added");
		} else {
			resp.setStatus(400);
			resp.setMessage("Invalid Data");
		}
		return resp;
	}

	@GetMapping("")
	public List<MusicFiles> getAllMusicList() {
		return (List<MusicFiles>) repository.findAll();
	}

//	@GetMapping("{id}")
//	public MusicFiles searchSongById(@PathVariable("id") int id, @RequestBody MusicFiles music) {
//
//		return repository.getById(id);
//	}

}

