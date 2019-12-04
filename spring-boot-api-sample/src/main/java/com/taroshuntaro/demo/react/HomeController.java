package com.taroshuntaro.demo.react;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	ArtistRepository artistRepository;
	@RequestMapping(value = "/api/artist", method = RequestMethod.GET)
	public List<Artist> index() {
		List<Artist> artistList = artistRepository.findAll();
		return artistList;
	}
}
