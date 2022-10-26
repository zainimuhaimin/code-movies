package idn.code.movies.controller;

import idn.code.movies.dto.BaseResponseDto;
import idn.code.movies.dto.movie.FindByTitleRequestDto;
import idn.code.movies.dto.movie.FindByTitleResponseDto;
import idn.code.movies.dto.movie.GetAllMovies;
import idn.code.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MoviesController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/getAllMovie")
    public GetAllMovies getAll(){
        return movieService.getAll();
    }

    @PostMapping("/findByTitle")
    public FindByTitleResponseDto findByTitle(@RequestBody FindByTitleRequestDto req){
        return  movieService.findByTitle(req);
    }


}
