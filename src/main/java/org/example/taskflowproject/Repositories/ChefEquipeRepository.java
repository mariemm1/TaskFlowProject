package org.example.taskflowproject.Repositories;

import org.example.taskflowproject.Models.ChefEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefEquipeRepository extends JpaRepository<ChefEquipe,Long> {
}
