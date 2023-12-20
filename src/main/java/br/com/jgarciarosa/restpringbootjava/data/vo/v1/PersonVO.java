package br.com.jgarciarosa.restpringbootjava.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "idKey", callSuper = false)
@JsonPropertyOrder({"person_id_key", "person_gender", "person_first_name", "person_last_name"})
public class PersonVO extends RepresentationModel<PersonVO> implements Serializable {

    @JsonProperty("person_id_key")
    private Long idKey;
    @JsonProperty("person_first_name")
    private String firstName;
    @JsonProperty("person_last_name")
    private String lastName;
    @JsonProperty("person_gender")
    private String gender;
}
