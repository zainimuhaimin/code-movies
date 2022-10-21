package idn.code.movies.service;

import idn.code.movies.dto.BaseResponseDto;
import idn.code.movies.dto.movie.FindByTitleRequestDto;
import idn.code.movies.dto.movie.FindByTitleResponseDto;
import idn.code.movies.dto.movie.GetAllMovies;
import idn.code.movies.model.MovieModel;
import idn.code.movies.repositories.MovieRepository;
import idn.code.movies.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public BaseResponseDto<GetAllMovies> getAll(){
        List<MovieModel> moviesModel = movieRepository.findAll();

        return ResponseUtil.success(GetAllMovies.builder()
                        .movies(moviesModel)
                .build());
    }

    public BaseResponseDto<FindByTitleResponseDto> findByTitle(FindByTitleRequestDto req){
        List<MovieModel> moviesResp = movieRepository.findByTitleContainsIgnoreCase(req.getTitle());

        return ResponseUtil.success(FindByTitleResponseDto.builder()
                       .movieLists(moviesResp)
                .build());

    }

}
