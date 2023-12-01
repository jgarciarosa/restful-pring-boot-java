package br.com.jgarciarosa.restpringbootjava.services;

import br.com.jgarciarosa.restpringbootjava.data.models.Person;
import br.com.jgarciarosa.restpringbootjava.data.vo.v1.PersonVO;
import br.com.jgarciarosa.restpringbootjava.exceptions.ResourceNotFoundException;
import br.com.jgarciarosa.restpringbootjava.mapper.modelmapper.ModelMapperConverter;
import br.com.jgarciarosa.restpringbootjava.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {

    @Autowired
    PersonRepository repository;

    @Autowired
    ModelMapperConverter modelMapperConverter;

    Logger logger = Logger.getLogger(PersonServices.class.getName());

    public PersonVO findById(Long id) {

        logger.info("Encontrando uma pessoa!");

        Person entity =  repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
                "ID não encontrado!"));

        return modelMapperConverter.parseObject(entity, PersonVO.class);
    }

    public List<PersonVO> findAll() {

        logger.info("Encontrando todas pessoas!");

        return modelMapperConverter.parseObjectList(repository.findAll(), PersonVO.class);
    }

    public PersonVO create(PersonVO personVO) {

        logger.info("Criando uma pessoa!");

        Person entity = modelMapperConverter.parseObject(personVO, Person.class);

        return modelMapperConverter.parseObject(repository.save(entity), PersonVO.class);
    }

    public PersonVO update(Long id, PersonVO personVO) {

        logger.info("Atualizando uma pessoa!");
        Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
                "Id não encontrado!"));
        entity.setFirstName(personVO.getFirstName());
        entity.setLastName(personVO.getLastName());
        entity.setGender(personVO.getGender());

        return modelMapperConverter.parseObject(repository.save(entity), PersonVO.class);
    }

    public void delete(Long id) {

        logger.info("Deletando uma pessoa!");
        Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
                "Id não encontrado!"));

        repository.delete(entity);
    }
}
