package br.com.jgarciarosa.restpringbootjava.mapper.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ModelMapperConverter {

    @Autowired
    ModelMapper modelMapper;

    public <Origin, Destination> Destination parseObject(Origin origin, Class<Destination> destinationClass) {

        return modelMapper.map(origin, destinationClass);
    }

    public <Origin, Destination> List<Destination> parseObjectList(List<Origin> origins, Class<Destination>
            destnationClass) {

        List<Destination> destinations = new ArrayList<>();
        for (Origin origin : origins) {
            destinations.add(modelMapper.map(origin, destnationClass));
        }

        return destinations;
    }
}
