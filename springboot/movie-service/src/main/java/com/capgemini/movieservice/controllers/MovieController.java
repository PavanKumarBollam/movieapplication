package com.capgemini.movieservice.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieservice.model.Movie;

@RestController
@RequestMapping("/movies")

public class MovieController {
	
	
	private List<Movie> movies;
	
	

	public MovieController() {
		super();
		movies=new ArrayList<Movie>();
			movies.add(new Movie(101,  2000,"Matrix", Arrays.asList("json taylor, BobMartin")));
			movies.add(new Movie(102,  2005,"Transformers", Arrays.asList("grant", "Byran")));

		
	}



	@GetMapping("/{movieId}")
	public Movie getMovieDetails(@PathVariable int movieId){
		for(Movie movie: movies) {
			if(movie.getMovieId()== movieId)
				return movie;
			
		}
		
		return null;
	}
}
