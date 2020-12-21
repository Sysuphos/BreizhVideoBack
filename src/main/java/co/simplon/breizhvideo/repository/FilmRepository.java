package co.simplon.breizhvideo.repository;

import co.simplon.breizhvideo.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
}
