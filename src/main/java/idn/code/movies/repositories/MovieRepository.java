package idn.code.movies.repositories;

import idn.code.movies.model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Long> {
    List<MovieModel> findByTitleContainsIgnoreCase(String title);
}
