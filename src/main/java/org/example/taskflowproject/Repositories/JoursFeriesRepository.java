package org.example.taskflowproject.Repositories;

import org.example.taskflowproject.Models.JoursFeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoursFeriesRepository extends JpaRepository<JoursFeries,Long> {
}
