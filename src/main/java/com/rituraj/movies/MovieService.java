package com.rituraj.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MoviesRepository moviesRepository;


    public List<Movie> allMovies(){
//        System.out.println(moviesRepository.findAll().toString());
        return moviesRepository.findAll();
    }

//    public Optional<Movie> singleMovie(ObjectId id){
//        return moviesRepository.findById(id);
//    }

    public Optional<Movie> singleMovie(String imdbId){
        return moviesRepository.findMovieByImdbId(imdbId);
    }

}
