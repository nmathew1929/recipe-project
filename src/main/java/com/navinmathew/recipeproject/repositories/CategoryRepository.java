package com.navinmathew.recipeproject.repositories;

import com.navinmathew.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
