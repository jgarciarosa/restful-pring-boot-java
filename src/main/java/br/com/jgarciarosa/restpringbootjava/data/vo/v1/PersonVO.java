package br.com.jgarciarosa.restpringbootjava.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@JsonPropertyOrder({"person_id", "person_gender", "person_first_name", "person_last_name"})
public class PersonVO implements Serializable {

    @JsonProperty("person_id")
    private Long id;
    @JsonProperty("person_first_name")
    private String firstName;
    @JsonProperty("person_last_name")
    private String lastName;
    @JsonProperty("person_gender")
    private String gender;
}
