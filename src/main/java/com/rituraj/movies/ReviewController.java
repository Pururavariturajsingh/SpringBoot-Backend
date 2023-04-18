package com.rituraj.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "https://localhost:8080")
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> crateReview(@RequestBody Map<String,String> payload){
        return new ResponseEntity<Review>(reviewService.ceateReview(payload.get("reviewBody"), payload.get("imdbId")),
                HttpStatus.CREATED);

    }


}
