package idn.code.movies.dto.movie;

import idn.code.movies.model.MovieModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindByTitleResponseDto implements Serializable {
    List<MovieModel> movieLists;

}
