package develop.movie.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired //helps instantiate movieRepository class.
    private MovieRepository movieRepository;

    // get all movies
    public List<Movie> allMovies(){
        System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();
    }

    //get one movie
    public Optional<Movie> singleMovie(ObjectId id){
        return  movieRepository.findById(id);
    }
}
