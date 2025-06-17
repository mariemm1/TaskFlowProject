package org.example.taskflowproject.Repositories;

import org.example.taskflowproject.Models.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EqipeRepository extends JpaRepository<Equipe,Long> {
}
