package pe.edu.cibertec.spring_mvc_jhelson.service;

import com.example.film_crud.model.Category;
import com.example.film_crud.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    /**
     * Obtiene todas las categorías disponibles en la base de datos.
     *
     * @return Lista de categorías
     */
    public List<Category> getAllCategories() {
        return categoryRepository.findAll(); // Asegúrate de que este método existe en el repositorio
    }
}
