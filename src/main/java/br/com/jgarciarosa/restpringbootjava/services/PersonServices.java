package br.com.jgarciarosa.restpringbootjava.services;

import br.com.jgarciarosa.restpringbootjava.data.models.Person;
import br.com.jgarciarosa.restpringbootjava.exceptions.ResourceNotFoundException;
import br.com.jgarciarosa.restpringbootjava.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {

    @Autowired
    PersonRepository repository;

    Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(Long id) {

        logger.info("Encontrando uma pessoa!");

        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ID não encontrado!"));
    }

    public List<Person> findAll() {

        logger.info("Encontrando todas pessoas!");

        return repository.findAll();
    }

    public Person create(Person person) {

        logger.info("Criando uma pessoa!");

        return repository.save(person);
    }

    public Person update(Long id, Person person) {

        logger.info("Atualizando uma pessoa!");
        Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
                "Id não encontrado!"));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setGender(person.getGender());

        return repository.save(entity);
    }

    public void delete(Long id) {

        logger.info("Deletando uma pessoa!");
        Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
                "Id não encontrado!"));

        repository.delete(entity);
    }
}
