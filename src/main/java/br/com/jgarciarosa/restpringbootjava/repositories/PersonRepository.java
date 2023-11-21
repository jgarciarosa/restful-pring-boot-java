package br.com.jgarciarosa.restpringbootjava.repositories;

import br.com.jgarciarosa.restpringbootjava.data.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
