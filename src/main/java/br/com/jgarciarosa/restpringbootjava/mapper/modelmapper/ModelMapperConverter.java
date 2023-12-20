package br.com.jgarciarosa.restpringbootjava.mapper.modelmapper;

import br.com.jgarciarosa.restpringbootjava.utils.ModelMapperConfig;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ModelMapperConverter {

    @Autowired
    ModelMapperConfig modelMapperConfig;

    public <Origin, Destination> Destination parseObject(Origin origin, Class<Destination> destinationClass) {

        return modelMapperConfig.modelMapper().map(origin, destinationClass);
    }

    public <Origin, Destination> List<Destination> parseObjectList(List<Origin> origins, Class<Destination>
            destnationClass) {

        List<Destination> destinations = new ArrayList<>();
        for (Origin origin : origins) {
            destinations.add(modelMapperConfig.modelMapper().map(origin, destnationClass));
        }

        return destinations;
    }
}
