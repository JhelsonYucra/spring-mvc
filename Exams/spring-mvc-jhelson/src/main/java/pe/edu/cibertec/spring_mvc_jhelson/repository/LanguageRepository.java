package pe.edu.cibertec.spring_mvc_jhelson.repository;

import com.example.film_crud.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {
}
