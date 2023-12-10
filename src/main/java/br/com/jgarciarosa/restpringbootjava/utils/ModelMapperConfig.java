package br.com.jgarciarosa.restpringbootjava.utils;

import br.com.jgarciarosa.restpringbootjava.data.models.Person;
import br.com.jgarciarosa.restpringbootjava.data.vo.v1.PersonVO;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(Person.class, PersonVO.class).addMappings(mapper -> {
            mapper.map(Person::getId, PersonVO::setIdKey);
        });

        return modelMapper;
    }
}
