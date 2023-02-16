package it.gaetanoquarto.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.gaetanoquarto.app.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

}