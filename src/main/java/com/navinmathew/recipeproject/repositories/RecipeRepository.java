package com.navinmathew.recipeproject.repositories;

import com.navinmathew.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
