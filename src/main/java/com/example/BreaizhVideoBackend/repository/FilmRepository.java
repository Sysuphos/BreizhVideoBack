package com.example.BreaizhVideoBackend.repository;


import com.example.BreaizhVideoBackend.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
}
