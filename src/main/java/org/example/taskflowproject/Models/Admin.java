package org.example.taskflowproject.Models;

import jakarta.persistence.Entity;
import org.example.taskflowproject.Models.Enum.Role;

import java.util.List;

@Entity
public class Admin extends User{
    public Admin() {
    }

    public Admin(Long id, String nom, String prenom, String email, String motDePasse, Role Role, List<Conge> conges) {
        super(id, nom, prenom, email, motDePasse, Role, conges);
    }

}
